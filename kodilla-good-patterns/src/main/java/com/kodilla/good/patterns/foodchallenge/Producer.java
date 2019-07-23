package com.kodilla.good.patterns.foodchallenge;

public class Producer {
    private String producerName;
    private String productName;
    private double productQuantity;

    public Producer(String producerName, String productName, double productQuantity) {
        this.producerName = producerName;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductQuantity() {
        return productQuantity;
    }
}