package com.example.demo.controller;

import com.example.demo.model.FareRequest;
import com.example.demo.model.MarketResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/market")
public class MarketControllerImpl implements MarketController {

    private MarketService service;

    public MarketControllerImpl(MarketService service) {this.service = service;}


    @Override
    @GetMapping(path = "/markets")
    public MarketResponse index() {
        return null;
    }

    @Override
    @PostMapping(path = "")
    public void addFares(@RequestBody FareRequest fareRequest) {

    }
}
