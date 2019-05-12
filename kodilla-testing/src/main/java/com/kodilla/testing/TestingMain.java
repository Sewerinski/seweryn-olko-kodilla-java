package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(5,5);
        int resultSubstract = calculator.substract(10,5);

        if(resultAdd==10) {
            System.out.println("Test ADD OK");
        }else{
            System.out.println("ERROR ADD");
        }

        if(resultSubstract==5) {
            System.out.println("Test SUBSTRACT OK");
        }else{
            System.out.println("ERROR SUBSTRACT");
        }
    }
}
