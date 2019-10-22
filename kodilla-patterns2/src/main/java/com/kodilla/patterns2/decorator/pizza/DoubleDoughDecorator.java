package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class DoubleDoughDecorator extends AbstractPizzaOrderDecorator {

    public DoubleDoughDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(3));
    }

    @Override
    public String getSpecification() {
        return super.getSpecification() + " + double dough";
    }
}
