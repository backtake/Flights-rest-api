package com.example.demo.service;

import com.example.demo.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarketService implements MarketProvider{

    private List<Fare> fares = new ArrayList<>();
    private List<Market> markets = new ArrayList<>();

    public void addFaresData(Fare fare) {
        fares.add(fare);
        markets = createMarketsOutOfFares(fares);
        getAllMarkets().addAll(markets);
    }

    public List<Market> getAllMarkets() {
        return MarketResponse.getAllMarkets();
    }

    private List<Market> createMarketsOutOfFares(List<Fare> fares) {
        return null;
    }


    private Market mapFareToMarket(Fare fare) {
        String marketId = createMarketId(fare);

        return null;
    }

    private String createMarketId(Fare fare) {
        return fare.getOrigin().trim() + "[" + fare.getDate().trim() + "]" + fare.getDestination().trim();
    }
}
