package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("", (a) -> "Tekst".toUpperCase());
        poemBeautifier.beautify("", (a) -> "INNY TEKST".toLowerCase());
        poemBeautifier.beautify("", (a) -> "Tekst plus" + " ABC");
        poemBeautifier.beautify("", (a) -> "ABC " + "Tekst inny");
        poemBeautifier.beautify("", (a) -> "  aaaa   ".trim());
    }
}