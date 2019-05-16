package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(ArrayList<Integer> numbers) {
        List<Integer> theNumbers = new ArrayList<>();
        for (Integer oddNumbers : numbers) {
            if (oddNumbers % 2 == 0) {
                theNumbers.add(oddNumbers);
            }
        }
        return theNumbers;
    }
}