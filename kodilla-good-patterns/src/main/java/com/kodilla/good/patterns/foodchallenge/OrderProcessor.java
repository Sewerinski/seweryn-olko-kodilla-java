package com.kodilla.good.patterns.foodchallenge;

public class OrderProcessor {

    private OrderService orderService;
    private OrderDto orderDto;

    public OrderProcessor(final OrderService orderService, final OrderDto orderDto) {
        this.orderService = orderService;
        this.orderDto = orderDto;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getProducer(), orderRequest.getOrderDate());

        if(isOrdered) {
            return new OrderDto(orderRequest.getProducer(), true);
        }else{
            return new OrderDto(orderRequest.getProducer(), false);
        }
    }
}
