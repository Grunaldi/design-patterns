package com.github.xenteros.designpatterns.adapter.arrayadapter;

public interface ArrayHolderAdapter {

    /**
     * @return array stored in ArrayHolder
     */
    int[] getArray();

    /**
     * @param array Array to be set on holder.
     */
    void setArray(int[] array);

    /**
     * @param i number to be added to ArrayHolder. Takes effect after flush.
     */
    void add(int i);

    /**
     * Applies changes done by add and sorted methods.
     */
    void flush();

    /**
     * Sorts the data stored in the adapter. Takes effect on ArrayHolder after flush.
     */
    void sorted();
}
