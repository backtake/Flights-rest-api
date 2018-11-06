package com.example.demo.model;

import java.util.List;

public class MarketResponse {

    private static List<Market> allMarkets;

    public static List<Market> getAllMarkets() {
        return allMarkets;
    }

    public static void setAllMarkets(List<Market> allMarkets) {
        MarketResponse.allMarkets = allMarkets;
    }
}
