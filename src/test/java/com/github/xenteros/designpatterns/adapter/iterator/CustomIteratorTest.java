package com.github.xenteros.designpatterns.adapter.iterator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

public class CustomIteratorTest {

    @Test
    public void shouldCurrentReturnSecondElement() {
        List<String> list = prepareList();

        Iterator<String> iterator = list.iterator();

        CustomIterator<String> stringCustomIterator = null; //TODO
        Assert.assertThat(stringCustomIterator.current(), is("A"));
    }

    private List<String> prepareList() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        return list;
    }
}
