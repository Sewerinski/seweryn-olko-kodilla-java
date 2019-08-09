package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        //Given

        //When
        double result = calculator.add(1, 0);
        double result1 = calculator.sub(2, 1);
        double result2 = calculator.mul(1, 1);
        double result3 = calculator.div(2, 2);
        //Then
        Assert.assertEquals(1, result, 0.001);
        Assert.assertEquals(1, result1, 0.001);
        Assert.assertEquals(1, result2, 1);
        Assert.assertEquals(1, result3,1 );
    }
}
