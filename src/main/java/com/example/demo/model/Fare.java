package com.example.demo.model;

import java.util.Date;

public class Fare {

    private String airline;
    private String origin;
    private String destination;
    private Date date;
    private Integer fare;

    public Fare(String airline, String origin, String destination, Date date, Integer fare) {
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.fare = fare;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getFare() {
        return fare;
    }

    public void setFare(Integer fare) {
        this.fare = fare;
    }
}
