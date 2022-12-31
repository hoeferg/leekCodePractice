package com.example.leekcodepractice;

public class reduceButGrow {
    public static int grow(int[] x) {
    int result = 1;
    for (int a : x) {
        result *= a;
    }
        return result;
    }
}
