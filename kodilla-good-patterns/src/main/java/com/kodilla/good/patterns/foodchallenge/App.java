package com.kodilla.good.patterns.foodchallenge;

public class App {

    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();

        OrderDto orderDto = new OrderDto("Kiełbasa", 3.5);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.process(extraFoodShop, orderDto);
    }
}
