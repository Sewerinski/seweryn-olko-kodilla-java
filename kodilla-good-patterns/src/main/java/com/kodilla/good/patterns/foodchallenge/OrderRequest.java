package com.kodilla.good.patterns.foodchallenge;

import java.time.LocalDateTime;

public class OrderRequest {

    private Producer producer;
    private LocalDateTime orderDate;

    public OrderRequest(Producer producer, LocalDateTime orderDate) {
        this.producer = producer;
        this.orderDate = orderDate;
    }

    public Producer getProducer() {
        return producer;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
