package com.github.xenteros.designpatterns.singleton;

public class Fibonacci {

    private static Fibonacci instance;

    private long[] fibonacciNumbers;

    public long get(int n) {
        return fibonacciNumbers[n];
    }

    private Fibonacci(){
        fibonacciNumbers = new long[100+1];
        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i < fibonacciNumbers.length; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2];
        }
    }

    public static Fibonacci getInstance() {
        if (instance == null) {
            instance = new Fibonacci();
        }
        return instance;
    }
}
