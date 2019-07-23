package com.kodilla.good.patterns.foodchallenge;

public class OrderProcessor {

    private OrderInformation orderInformation;

    public OrderProcessor(final OrderInformation orderInformation) {
        this.orderInformation = orderInformation;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderInformation.order(orderRequest.getProducer(), orderRequest.getOrderDate());

        if (isOrdered) {
            return new OrderDto(orderRequest.getProducer(), true);
        } else {
            return new OrderDto(orderRequest.getProducer(), false);
        }
    }
}