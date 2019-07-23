package com.kodilla.good.patterns.foodchallenge;

public class App {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new ProductOrderService());
        orderProcessor.process(orderRequest);
    }
}
