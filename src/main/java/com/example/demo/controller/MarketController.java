package com.example.demo.controller;

import com.example.demo.model.Fare;
import com.example.demo.model.Market;
import com.example.demo.service.MarketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarketController {

    private MarketService service;

    public MarketController(MarketService service) {this.service = service;}

    @RequestMapping(value = "/market/markets", method = RequestMethod.GET)
    public List<Market> index() {
        return this.service.getAllMarkets();
    }

    @RequestMapping(value = "/market", method = RequestMethod.POST, consumes = "application/json")
    public void addFare(@RequestBody List<Fare> fares) {
        this.service.addFaresData(fares);
    }
}
