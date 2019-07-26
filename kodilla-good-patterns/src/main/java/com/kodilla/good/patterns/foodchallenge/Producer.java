package com.kodilla.good.patterns.foodchallenge;

public class Producer {
    private String producerName;
    private Product product;

    public Producer(String producerName, Product product) {
        this.producerName = producerName;
        this.product = product;
    }

    public String getProducerName() {
        return producerName;
    }

    public Product getProduct() {
        return product;
    }
}
