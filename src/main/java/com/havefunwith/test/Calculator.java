package com.havefunwith.test;

import java.util.Arrays;

public class Calculator {

    // Convert it to Java Streams
//    public int add(int ...numbers) {
//        int sum = 0;
//        for (int num : numbers) {
//            sum += num;
//        }
//        return sum;
//    }

    public int add(int ...numbers) {
        int sum = Arrays.stream(numbers).sum();
        return sum;
    }

}
