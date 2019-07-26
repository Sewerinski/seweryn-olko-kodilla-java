package com.kodilla.good.patterns.foodchallenge;

public class OrderDto {

    String product;
    double productQuantity;

    public OrderDto(String product, double productQuantity) {
        this.product = product;
        this.productQuantity = productQuantity;
    }

    public String getProduct() {
        return product;
    }

    public double getProductQuantity() {
        return productQuantity;
    }
}