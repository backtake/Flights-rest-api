package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class FareRequest {

    private List<Fare> allFares = new ArrayList<>();

    public List<Fare> getAllFares() {
        return allFares;
    }

    public void setAllFares(List<Fare> allFares) {
        this.allFares = allFares;
    }
}
