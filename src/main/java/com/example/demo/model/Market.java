package com.example.demo.model;

public class Market {

    private String marketId;
    private String maxCompetitor;
    private Integer maxFare;
    private String minCompetitor;
    private Integer minFare;
    private float avgFare;

    public Market(String marketId, String maxCompetitor, Integer maxFare, String minCompetitor, Integer minFare, float avgFare) {
        this.marketId = marketId;
        this.maxCompetitor = maxCompetitor;
        this.maxFare = maxFare;
        this.minCompetitor = minCompetitor;
        this.minFare = minFare;
        this.avgFare = avgFare;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getMaxCompetitor() {
        return maxCompetitor;
    }

    public void setMaxCompetitor(String maxCompetitor) {
        this.maxCompetitor = maxCompetitor;
    }

    public Integer getMaxFare() {
        return maxFare;
    }

    public void setMaxFare(Integer maxFare) {
        this.maxFare = maxFare;
    }

    public String getMinCompetitor() {
        return minCompetitor;
    }

    public void setMinCompetitor(String minCompetitor) {
        this.minCompetitor = minCompetitor;
    }

    public Integer getMinFare() {
        return minFare;
    }

    public void setMinFare(Integer minFare) {
        this.minFare = minFare;
    }

    public float getAvgFare() {
        return avgFare;
    }

    public void setAvgFare(float avgFare) {
        this.avgFare = avgFare;
    }
}
