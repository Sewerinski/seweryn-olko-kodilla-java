package com.kodilla.good.patterns.foodchallenge;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderInformation {

    public boolean order(final Producer producer, LocalDateTime orderDate) {
        System.out.println("Producer: " + producer.getProducerName() + producer.getProductName() + producer.getProductQuantity()
                + "order date: " + orderDate.toString());
        return true;
    }
}
