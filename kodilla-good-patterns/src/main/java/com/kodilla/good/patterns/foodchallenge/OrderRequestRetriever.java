package com.kodilla.good.patterns.foodchallenge;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        Producer producer = new Producer("ExtraFoodShop ", "Potato ", 5.5);
        LocalDateTime orderDate = LocalDateTime.of(2019, 9, 16, 20, 0);

        return new OrderRequest(producer, orderDate);
    }
}
