package com.example.demo.controller;

import com.example.demo.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarketService {

    public void addFaresData(Fare fare) {
        List<Fare> fares = new ArrayList<>();
        fares.add(fare);
        List<Market> markets = createMarketsOutOfFares(fares);
        getAllMarkets().addAll(markets);
    }

    private List<Market> createMarketsOutOfFares(List<Fare> fares) {
        return null;
    }

    public List<Market> getAllMarkets() {
        return MarketResponse.getAllMarkets();
    }

    private Market mapFareToMarket(Fare fare) {
        String marketId = createMarketId(fare);

        return null;
    }

    private String createMarketId(Fare fare) {
        return fare.getOrigin() + "[" + fare.getDate().trim() + "]" + fare.getDestination();
    }
}
