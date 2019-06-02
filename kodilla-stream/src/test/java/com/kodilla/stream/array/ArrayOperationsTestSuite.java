package com.kodilla.stream.array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 4;
        numbers[2] = 5;
        numbers[3] = 3;
        numbers[4] = 2;

        //When
        double avg = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(3.8, avg,0);
    }
}