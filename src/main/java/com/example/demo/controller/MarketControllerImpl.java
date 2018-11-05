package com.example.demo.controller;

import com.example.demo.model.Fare;
import com.example.demo.model.Market;
import com.example.demo.service.MarketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/market")
public class MarketControllerImpl {

    private MarketService service;

    public MarketControllerImpl(MarketService service) {this.service = service;}

    @GetMapping(path = "/markets")
    public List<Market> index() {
        return this.service.getAllMarkets();
    }

    @PostMapping(path = "")
    public void addFare(@RequestBody Fare fare) {
        this.service.addFaresData(fare);
    }
}
