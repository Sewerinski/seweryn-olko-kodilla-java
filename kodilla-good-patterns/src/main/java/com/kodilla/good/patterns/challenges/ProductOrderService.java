package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    public boolean order(final User user, final LocalDateTime orderDate, final LocalDateTime orderShipmentDate) {
        System.out.println("Order a product: " + user.getName() + user.getSurname() + "order date: " + orderDate.toString() + "shipment date: " + orderShipmentDate.toString() );
        return true;
    }
}
