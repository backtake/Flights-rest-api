package com.example.demo.service;

import com.example.demo.model.Fare;
import com.example.demo.model.Market;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MarketServiceTest {

    @Autowired
    private MarketService service;

    private Fare fare1;
    private Fare fare2;
    private Fare fare3;
    private Fare fare4;
    private Market market1;
    private Market market2;

    @Before
    public void mockFaresAndMarketsObjects() {
        fare1 = new Fare("SU", "WAW", "DME", " 25/09/2018", 110);
        fare2 = new Fare("LO", "WAW", "DME", " 25/09/2018", 120);
        fare3 = new Fare("N4", "SVO", "WAW", " 15/09/2018", 150);
        fare4 = new Fare("KL", "SVO", "WAW", " 15/09/2018", 100);
        market1 = new Market("WAW[25/09/2018]DME", "LO", 120, "SU", 110, 115.0f);
        market2 = new Market("SVO[15/09/2018]WAW", "N4", 150, "KL", 100, 125.0f);
    }

    @Test
    public void getAllMarketsTest() {
        List<Market> allMarkets = Arrays.asList(market1, market2);
        List<Fare> allFares = Arrays.asList(fare1, fare2, fare3, fare4);
        service.createMarketOutOfGivenFares(allFares);
        assertReflectionEquals(allMarkets, service.getAllMarkets());
    }

}