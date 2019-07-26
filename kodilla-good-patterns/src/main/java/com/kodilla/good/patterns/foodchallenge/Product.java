package com.kodilla.good.patterns.foodchallenge;

public class Product {

    private String productType;
    private double productQuantity;

    public Product(String product, double productQuantity) {
        this.productType = product;
        this.productQuantity = productQuantity;
    }

    public String getProductType() {
        return productType;
    }

    public double getProductQuantity() {
        return productQuantity;
    }
}