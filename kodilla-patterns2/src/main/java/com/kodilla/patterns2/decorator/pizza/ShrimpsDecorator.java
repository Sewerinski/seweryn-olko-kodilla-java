package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ShrimpsDecorator extends AbstractPizzaOrderDecorator {

    public ShrimpsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }

    @Override
    public String getSpecification() {
        return super.getSpecification() + " + shrimps";
    }
}
