package com.kodilla.good.patterns.foodchallenge;

public class OrderProcessor {

    private OrderService orderService;
    private OrderDto orderDto;

    public boolean process(final OrderService orderService, final OrderDto orderDto) {
        return orderService.order(orderDto);
    }
}
