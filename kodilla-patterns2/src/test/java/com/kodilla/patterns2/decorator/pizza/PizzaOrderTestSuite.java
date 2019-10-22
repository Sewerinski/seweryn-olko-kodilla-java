package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal price = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(15), price);
    }

    @Test
    public void testBasicPizzaOrderGetSpecification() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String specification = theOrder.getSpecification();
        //Then
        assertEquals("Basic pizza - dough, tomato sauce and cheese", specification);
    }

    @Test
    public void testBasicPizzaOrderWithFourIngredientsGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new ChamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        //When
        BigDecimal price = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(23), price);
    }

    @Test
    public void testBasicPizzaOrderWithFourIngredientsGetSpecification() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new ChamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        //When
        String specification = theOrder.getSpecification();
        //Then
        assertEquals("Basic pizza - dough, tomato sauce and cheese + double cheese + cham + mushrooms + onion", specification);
    }

    @Test
    public void testBasicPizzaOrderWithDoubleDoughAndCheeseGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new DoubleDoughDecorator(theOrder);
        //When
        BigDecimal price = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(23), price);
    }

    @Test
    public void testBasicPizzaOrderWithDoubleDoughAndCheeseGetSpecification() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new DoubleDoughDecorator(theOrder);
        //When
        String specification = theOrder.getSpecification();
        //Then
        assertEquals("Basic pizza - dough, tomato sauce and cheese + double cheese + double dough", specification);
    }
}
