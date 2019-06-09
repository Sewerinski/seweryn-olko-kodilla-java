package com.kodilla.exception.test;

public class FlightSearchingRunner {
    public static void main(String[] args) {

        Flight flight = new Flight("Canada", "New York");
        Flight flight1 = new Flight("Hong Kong", "Warsaw");
        Flight flight2 = new Flight("Italy", "Germany");

        FlightSearching flightSearching = new FlightSearching();

        try {
            System.out.println(flightSearching.findFlight(flight));
        }catch (Exception e){
            System.out.println("Exception");
        }
        try {
            System.out.println(flightSearching.findFlight(flight1));
        }catch (Exception e){
            System.out.println("Exception");
        }
        try {
            System.out.println(flightSearching.findFlight(flight2));
        }catch (Exception e){
            System.out.println("Exception");
        }


    }
}
