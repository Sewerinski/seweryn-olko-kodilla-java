package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearching {
    public boolean findFlight(Flight flight) {
        Map<String, Boolean> flightMap = new HashMap<>();

        flightMap.put("Hong Kong", true);
        flightMap.put("Canada", true);
        flightMap.put("Japan", false);
        flightMap.put("Warsaw", true);

        if(flightMap.containsKey(flight.getArrivalAirport())) {
            return flightMap.get(flight.getArrivalAirport());
        }else{
            throw new RouteNotFoundException();
        }
    }
}