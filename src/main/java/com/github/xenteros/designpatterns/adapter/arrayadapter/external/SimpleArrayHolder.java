package com.github.xenteros.designpatterns.adapter.arrayadapter.external;

public class SimpleArrayHolder implements ArrayHolder{

    private int[] array;

    public SimpleArrayHolder(int[] array) {
        this.array = array;
    }

    @Override
    public int[] getArray() {
        return array;
    }

    @Override
    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public void print() {
        System.out.println(array);
    }
}
