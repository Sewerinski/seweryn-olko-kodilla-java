package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.add(1, 0);
        double result1 = calculator.sub(2, 1);
        double result2 = calculator.mul(1, 1);
        double result3 = calculator.div(2, 2);
        //Then
        Assert.assertEquals(1, result, 1);
        Assert.assertEquals(1, result1, 1);
        Assert.assertEquals(1, result2, 1);
        Assert.assertEquals(1, result3,1 );
    }
}
