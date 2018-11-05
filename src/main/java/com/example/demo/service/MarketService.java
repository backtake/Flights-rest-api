package com.example.demo.service;

import com.example.demo.model.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MarketService implements MarketProvider{

    public List<Market> getAllMarkets() {
        return MarketResponse.getAllMarkets();
    }

    public void addFaresData(FareRequest fareRequest) {
        List<Market> markets = createMarketsOutOfFares(fareRequest.getAllFares());
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

        Iterator<Map.Entry<String, LinkedList<Fare>>> it = flightRoutesFares.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String, LinkedList<Fare>> pair = it.next();
            markets.add(createMarket(pair));
        }

        return markets;
    }

    private Market createMarket(Map.Entry<String, LinkedList<Fare>> pair) {
        String marketId = pair.getKey();
        String maxCompetitor = getMaxCompetitor(pair.getValue());
        Integer maxFare = getMaxFare(pair.getValue());
        String minCompetitor = getMinCompetitor(pair.getValue());
        Integer minFare = getMinFare(pair.getValue());
        float avgFare = getAvgFare(pair.getValue());

        return new Market(marketId, maxCompetitor, maxFare, minCompetitor, minFare, avgFare);
    }

    private String getMaxCompetitor(LinkedList<Fare> fares) {
        Fare fareWithMaxCompetitor = fares.get(0);

        for (Fare fare : fares) {
            if(fare.getFare()>fareWithMaxCompetitor.getFare()) {
                fareWithMaxCompetitor = fare;
            }
        }

        return fareWithMaxCompetitor.getAirline();
    }
}
