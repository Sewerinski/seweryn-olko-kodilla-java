package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Seweryn", "Olko");

        LocalDateTime orderDate = LocalDateTime.of(2019, 9, 14, 10, 0);
        LocalDateTime orderShipmentDate = LocalDateTime.of(2019, 9, 16, 10, 0);

        return new OrderRequest(user, orderDate, orderShipmentDate);
    }
}
