package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsList {

    private final List<Flights> flightsList = new ArrayList<>();

    public FlightsList() {
        flightsList.add(new Flights("Warszawa", "Gdańsk"));
        flightsList.add(new Flights("Gdańsk", "Zakopane"));
        flightsList.add(new Flights("Poznań", "Warszawa"));
        flightsList.add(new Flights("Warszawa", "Poznań"));
        flightsList.add(new Flights("Wrocław", "Warszawa"));
        flightsList.add(new Flights("Warszawa", "Wrocław"));
    }

    public List<Flights> getList() {
        return new ArrayList<>(flightsList);
    }
}
