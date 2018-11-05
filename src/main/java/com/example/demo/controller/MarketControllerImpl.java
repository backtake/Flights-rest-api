package com.example.demo.controller;

import com.example.demo.model.FareRequest;
import com.example.demo.model.Market;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/market")
public class MarketControllerImpl implements MarketController {

    private MarketService service;

    public MarketControllerImpl(MarketService service) {this.service = service;}


    @Override
    @GetMapping(path = "/markets")
    public List<Market> index() {
        return this.service.getAllMarkets();
    }

    @Override
    @PostMapping(path = "")
    public void addFares(@RequestBody FareRequest fareRequest) {
        this.service.addFaresData(fareRequest);
    }
}
