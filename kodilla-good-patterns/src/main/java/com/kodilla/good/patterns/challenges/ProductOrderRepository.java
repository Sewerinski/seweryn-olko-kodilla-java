package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository{

    public boolean createOrder(User user, LocalDateTime orderDate, LocalDateTime orderShipmentDate) {
        System.out.println("Order a product: " + user.getName() + user.getSurname() + "order date: " + orderDate.toString() + "shipment date: " + orderShipmentDate.toString() );
        return true;
    }
}
