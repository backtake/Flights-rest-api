package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class MarketResponse {

    private static List<Market> allMarkets = new ArrayList<>();

    public static List<Market> getAllMarkets() {
        return allMarkets;
    }

    public static void setAllMarkets(List<Market> allMarkets) {
        MarketResponse.allMarkets = allMarkets;
    }
}
