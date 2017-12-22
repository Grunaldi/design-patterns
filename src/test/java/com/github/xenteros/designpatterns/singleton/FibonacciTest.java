package com.github.xenteros.designpatterns.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertSame;

public class FibonacciTest {

    @Test
    public void testMultithreading() {
        List<Fibonacci> fibonacciList = Collections.synchronizedList(new ArrayList<>());
        List<Thread> threadList = Collections.synchronizedList(new ArrayList<>());
        for (int i = 0; i < 100; i++) {
            Runnable runnable = () -> fibonacciList.add(Fibonacci.getInstance());
            Thread thread = new Thread(runnable);
            threadList.add(thread);
        }

        for (Thread thread : threadList) {
            thread.start();
        }

        for (Thread thread : threadList) {
            while (thread.isAlive()){}
        }

        for (int i = 0; i < fibonacciList.size(); i++) {
            for (int j = 0; j < fibonacciList.size(); j++) {
                assertSame("References with indexes " + i + " and " + j + " point to different objects", fibonacciList.get(i), fibonacciList.get(j));
            }
        }
    }

    @Test
    public void shouldReturn8() {
        Assert.assertEquals(8, Fibonacci.getInstance().get(5));
    }

    @Test
    public void shouldReturnTheSameInstance() {
        Fibonacci f = Fibonacci.getInstance();
        Fibonacci g = Fibonacci.getInstance();

        assertSame(f, g);
    }

    @Test
    public void shouldReturnNonNullInstance() {
        Assert.assertNotNull(Fibonacci.getInstance());
    }
}
