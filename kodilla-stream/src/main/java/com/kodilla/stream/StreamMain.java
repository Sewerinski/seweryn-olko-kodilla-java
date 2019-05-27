package com.kodilla.stream;

import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        /*
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("", (a) -> "Tekst".toUpperCase());
        poemBeautifier.beautify("", (a) -> "INNY TEKST".toLowerCase());
        poemBeautifier.beautify("", (a) -> "Tekst plus" + " ABC");
        poemBeautifier.beautify("", (a) -> "ABC " + "Tekst inny");
        poemBeautifier.beautify("", (a) -> "  aaaa   ".trim());
         */

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}