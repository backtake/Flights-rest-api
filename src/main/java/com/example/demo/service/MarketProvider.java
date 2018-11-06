package com.example.demo.service;

import com.example.demo.model.Fare;
import com.example.demo.model.Market;

import java.util.List;

public interface MarketProvider {

    void addFaresData(List<Fare> fares);
    List<Market> getAllMarkets();
}
