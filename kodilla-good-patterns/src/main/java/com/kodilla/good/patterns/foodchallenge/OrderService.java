package com.kodilla.good.patterns.foodchallenge;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(Producer producer, LocalDateTime orderDate);
}