package com.example.leekcodepractice;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        //Using for loop and If statement
        int counter = 0;
        if (Boolean present : arrayOfSheeps) {
            if (present !=null && present) {
                counter +=1;
            }
        }
        return counter;
    }
}
