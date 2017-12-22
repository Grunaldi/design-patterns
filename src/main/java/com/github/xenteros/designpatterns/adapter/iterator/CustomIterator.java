package com.github.xenteros.designpatterns.adapter.iterator;

import java.util.Iterator;

public interface CustomIterator<E> extends Iterator<E> {

    E current();
}
