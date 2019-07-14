package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime orderDate;
    private LocalDateTime orderShipmentDate;

    public OrderRequest(User user, LocalDateTime orderDate, LocalDateTime orderShipmentDate) {
        this.user = user;
        this.orderDate = orderDate;
        this.orderShipmentDate = orderShipmentDate;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public LocalDateTime getOrderShipmentDate() {
        return orderShipmentDate;
    }
}
