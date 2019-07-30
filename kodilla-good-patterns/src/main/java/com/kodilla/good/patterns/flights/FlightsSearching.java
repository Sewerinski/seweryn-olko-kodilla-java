package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightsSearching {

    private FlightsList flightsList = new FlightsList();

    public List<Flights> flightsFrom(String from) {
        return flightsList.getList().stream()
                .filter(f -> f.getDepartureAirport().equals(from))
                .collect(Collectors.toList());
    }

    public List<Flights> flightsTo(String to) {
        return flightsList.getList().stream()
                .filter(f -> f.getArrivalAirport().equals(to))
                .collect(Collectors.toList());
    }

    public List<Flights> flightsThrough(String from, String through, String to) {
        List<Flights> part1 = flightsList.getList().stream()
                .filter(f -> f.getDepartureAirport().equals(from))
                .filter(f -> f.getArrivalAirport().equals(through))
                .collect(Collectors.toList());

        List<Flights> part2 = flightsList.getList().stream()
                .filter(f -> f.getDepartureAirport().equals(through))
                .filter(f -> f.getArrivalAirport().equals(to))
                .collect(Collectors.toList());

        part1.addAll(part2);

        return part1;
    }
}