package com.example.demo.service;

import com.example.demo.model.FareRequest;
import com.example.demo.model.Market;

import java.util.List;

public interface MarketProvider {

    void addFaresData(FareRequest fareRequest);
    List<Market> getAllMarkets();
}
