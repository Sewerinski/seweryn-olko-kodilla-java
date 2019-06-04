package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(55,1);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("ACHTUNG! ACHTUNG!");
        } finally {
            System.out.println("Never gonna give you up :)");
        }
    }
}
