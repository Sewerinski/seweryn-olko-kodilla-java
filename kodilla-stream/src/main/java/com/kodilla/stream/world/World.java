package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {
    private final Set<Continent> continents = new HashSet<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(c -> c.getCountries().stream())
                .map(c -> c.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}