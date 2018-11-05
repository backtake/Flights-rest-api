package com.example.demo.service;

import com.example.demo.model.Fare;
import com.example.demo.model.Market;

import java.util.List;

public interface MarketProvider {

    void addFaresData(Fare fare);
    List<Market> getAllMarkets();
}
