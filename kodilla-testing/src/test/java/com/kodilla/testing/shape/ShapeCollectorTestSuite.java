package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigureAndGetFigure() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Circle c = new Circle();
        //When
        sc.addFigure(c);
        Shape s = sc.getFigure(0);
        //Then
        Assert.assertEquals(c,s);
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Circle c = new Circle();
        Square s = new Square();
        sc.addFigure(c);
        sc.addFigure(s);
        //When
        sc.removeFigure(c);
        //Then
        Shape result = sc.getFigure(0);
        Assert.assertEquals(s,result);
    }
}