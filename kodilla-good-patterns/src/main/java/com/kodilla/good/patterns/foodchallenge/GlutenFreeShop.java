package com.kodilla.good.patterns.foodchallenge;

import java.time.LocalDateTime;

public class GlutenFreeShop implements OrderService {

    public boolean order(final Producer producer, final LocalDateTime orderDate) {
        System.out.println("Kiełbasa" + 5.5);
        return true;
    }
}