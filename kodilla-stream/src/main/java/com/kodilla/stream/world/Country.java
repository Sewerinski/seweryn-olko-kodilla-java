package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final BigDecimal peopleQuantity;
    private final String countryName;

    public Country(BigDecimal peopleQuantity, String countryName) {
        this.peopleQuantity = peopleQuantity;
        this.countryName = countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }
}
