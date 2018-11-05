package com.example.demo.controller;

import com.example.demo.model.FareRequest;
import com.example.demo.model.MarketResponse;
import org.springframework.web.bind.annotation.RequestBody;

public interface MarketController {

    MarketResponse index();
    void addFares(@RequestBody FareRequest fareRequest);
}
