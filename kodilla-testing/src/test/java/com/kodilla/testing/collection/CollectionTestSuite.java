package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator emptyList = new OddNumbersExterminator();
        ArrayList<Integer> numberList = new ArrayList<>();
        //When
        List<Integer> result = emptyList.exterminate(numberList);
        //Then
        Assert.assertEquals(0, result.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator normalList = new OddNumbersExterminator();
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        //When
        List<Integer> result = normalList.exterminate(numberList);
        //Then
        Assert.assertEquals(3,3, result.size());
    }
}
