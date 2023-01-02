package com.example.leekcodepractice;

public class BusSpace {
    public static int enough(int cap, int on, int wait) {
        //Utilize the Math.max method
        return Math.max(0, on + wait - cap);
    }
}
