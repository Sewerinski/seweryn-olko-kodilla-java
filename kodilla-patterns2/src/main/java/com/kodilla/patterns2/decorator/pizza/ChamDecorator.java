package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ChamDecorator extends AbstractPizzaOrderDecorator {

    public ChamDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(1));
    }

    @Override
    public String getSpecification() {
        return super.getSpecification() + " + cham";
    }
}
