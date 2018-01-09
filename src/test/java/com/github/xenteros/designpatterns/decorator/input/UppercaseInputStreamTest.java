package com.github.xenteros.designpatterns.decorator.input;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class UppercaseInputStreamTest {

    @Test
    public void shouldReadUpperCase() {
        UppercaseInputStream inputStream = new UppercaseInputStream(new ByteArrayInputStream("Test".getBytes()));
        Scanner sc = new Scanner(inputStream);
        String res = sc.nextLine();
        Assert.assertTrue(res.equals(res.toUpperCase()));
    }
}
