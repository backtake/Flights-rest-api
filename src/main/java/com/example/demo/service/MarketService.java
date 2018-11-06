package com.example.demo.service;

import com.example.demo.model.*;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class MarketService implements MarketProvider{

    public List<Market> getAllMarkets() {
        return MarketResponse.getAllMarkets();
    }

    public void addFaresData(List<Fare> fares) {
        List<Market> markets = createMarketsOutOfFares(fares);
        getAllMarkets().addAll(markets);
    }

    private List<Market> createMarketsOutOfFares(List<Fare> fares) {
        return getMarkets(aggregateFares(fares));
    }

    private Map<String, LinkedList<Fare>> aggregateFares(List<Fare> fares) {
        Map<String, LinkedList<Fare>> flightRoutesFares = new HashMap<>();
        String marketId;
        LinkedList<Fare> faresByFlightRoutes;

        for (Fare fare : fares) {
            marketId=createMarketId(fare);

            if (flightRoutesFares.get(marketId)==null) {
                faresByFlightRoutes = new LinkedList<>();
                faresByFlightRoutes.add(fare);
                flightRoutesFares.put(createMarketId(fare), faresByFlightRoutes);

            } else {
                flightRoutesFares.get(marketId).add(fare);
            }
        }
        return flightRoutesFares;
    }

    private String createMarketId(Fare fare) {
        return fare.getOrigin().trim() + "[" + fare.getDate().trim() + "]" + fare.getDestination().trim();
    }

    private List<Market> getMarkets(Map<String, LinkedList<Fare>> flightRoutesFares) {
        List<Market> markets = new LinkedList<>();

        for (Map.Entry<String, LinkedList<Fare>> pair : flightRoutesFares.entrySet()) {
            markets.add(createMarket(pair));
        }

        return markets;
    }

    private Market createMarket(Map.Entry<String, LinkedList<Fare>> pair) {
        String marketId = pair.getKey();
        LinkedList<Fare> sortedFares = pair.getValue().
                stream().
                sorted(Comparator.comparing(Fare::getFare)).
                collect(Collectors.toCollection(LinkedList::new));

        String maxCompetitor = sortedFares.getFirst().getAirline();
        Integer maxFare = sortedFares.getFirst().getFare();
        String minCompetitor = sortedFares.getLast().getAirline();
        Integer minFare = sortedFares.getLast().getFare();
        float avgFare = (float) pair.getValue().
                stream().
                mapToInt(Fare::getFare).
                average().orElse(Float.NaN);

        return new Market(marketId, maxCompetitor, maxFare, minCompetitor, minFare, avgFare);
    }

}
