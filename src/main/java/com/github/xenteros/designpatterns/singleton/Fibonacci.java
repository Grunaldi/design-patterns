package com.github.xenteros.designpatterns.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Fibonacci {

    private static Fibonacci instance;
    private static Lock lock = new ReentrantLock();

    private long[] fibonacciNumbers;

    public long get(int n) {
        return fibonacciNumbers[n];
    }

    private Fibonacci() {
        fibonacciNumbers = new long[100 + 1];
        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i < fibonacciNumbers.length; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }
    }

    public synchronized static Fibonacci getInstance() {
        if (instance == null) {
            lock.lock();
            if (instance == null) {
                instance = new Fibonacci();
            }
            lock.unlock();
        }

        return instance;
    }
}
