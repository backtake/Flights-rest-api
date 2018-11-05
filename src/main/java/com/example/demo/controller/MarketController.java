package com.example.demo.controller;

import com.example.demo.model.Fare;
import com.example.demo.model.Market;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface MarketController {

    List<Market> index();
    void addFare(@RequestBody Fare fare);
}
