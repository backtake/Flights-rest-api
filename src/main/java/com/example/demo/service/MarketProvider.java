package com.example.demo.service;

import com.example.demo.model.Fare;
import com.example.demo.model.FareRequest;
import com.example.demo.model.Market;

import java.util.ArrayList;
import java.util.List;

public interface MarketProvider {

    void addFaresData(ArrayList<Fare> allFares);
    List<Market> getAllMarkets();
}
