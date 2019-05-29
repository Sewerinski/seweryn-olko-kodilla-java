package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal("38000000"), "Poland");
        Country germany = new Country(new BigDecimal("49000000"), "Germany");
        Country italy = new Country(new BigDecimal("18000000"), "Italy");

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(italy);

        Country china = new Country(new BigDecimal("5000000000"), "China");
        Country japan = new Country(new BigDecimal("10000000"), "Japan");

        Continent asia = new Continent("Asia");
        asia.addCountry(china);
        asia.addCountry(japan);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("5115000000"), result);

    }
}