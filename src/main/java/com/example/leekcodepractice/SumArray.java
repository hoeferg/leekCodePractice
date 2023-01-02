package com.example.leekcodepractice;
import java.util.Arrays;

public class SumArray {
    public static double sum(double[] numbers) {
        //Use the Arrays.stream method, followed by the sum method
        //Remeber to import the jav.util.Arrays class before running the code
        return Arrays.stream(numbers).sum();
    }
}
