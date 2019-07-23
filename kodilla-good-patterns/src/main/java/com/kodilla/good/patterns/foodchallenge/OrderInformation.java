package com.kodilla.good.patterns.foodchallenge;

import java.time.LocalDateTime;

public interface OrderInformation {

    boolean order(Producer producer, LocalDateTime orderDate);
}
