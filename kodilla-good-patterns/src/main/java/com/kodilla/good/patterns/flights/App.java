package com.kodilla.good.patterns.flights;

import java.util.List;

public class App {

    public static void main(String[] args) {

        FlightsSearching flightsSearching = new FlightsSearching();

        System.out.println("Flights from Warszawa to Zakopane via Gdańsk:");
        List<Flights> flightsList = flightsSearching.flightsThrough("Warszawa", "Gdańsk", "Zakopane");
        flightsList.forEach(System.out::println);

        System.out.println("Flights from Warszawa:");
        flightsList = flightsSearching.flightsFrom("Warszawa");
        flightsList.forEach(System.out::println);

        System.out.println("Flights to Zakopane:");
        flightsList = flightsSearching.flightsTo("Zakopane");
        flightsList.forEach(System.out::println);
    }
}