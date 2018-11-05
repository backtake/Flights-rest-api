package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/market")
public class MarketControllerImpl {

    private MarketService service;

    public MarketControllerImpl(MarketService service) {this.service = service;}


}
