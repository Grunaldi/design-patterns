package com.github.xenteros.designpatterns.adapter.arrayadapter.external;


import org.junit.Assert;
import org.junit.Test;

public class SimpleArrayHolderTest {

    @Test
    public void shouldReturnArrayPassedByConstructor() {
        int[] arr = new int[]{1,2,3,4,5,6};

        ArrayHolder arrayHolder = new SimpleArrayHolder(arr);
        Assert.assertArrayEquals(arr, arrayHolder.getArray());
    }

    @Test
    public void shouldReturnArraySet() {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};

        ArrayHolder arrayHolder = new SimpleArrayHolder(new int[]{});
        arrayHolder.setArray(arr);
        Assert.assertArrayEquals(arr, arrayHolder.getArray());
    }


}
