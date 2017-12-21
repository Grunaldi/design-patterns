package com.github.xenteros.designpatterns.adapter.arrayadapter;

import com.github.xenteros.designpatterns.adapter.arrayadapter.external.ArrayHolder;
import com.github.xenteros.designpatterns.adapter.arrayadapter.external.SimpleArrayHolder;
import org.junit.Assert;
import org.junit.Test;

public class ArrayHolderAdapterTest {

    @Test
    public void shouldAddTwoNumbersAfterFlush() {
        int[] arr = new int[] {1,2,3,4,5};
        ArrayHolder arrayHolder = new SimpleArrayHolder(arr);

        ArrayHolderAdapter arrayHolderAdapter = null;
        arrayHolderAdapter.add(6);
        arrayHolderAdapter.add(7);
        arrayHolderAdapter.flush();
        Assert.assertEquals(new int[]{1,2,3,4,5,6,7}, arrayHolder.getArray());
    }

    @Test
    public void shouldNotAddNumbersWithoutFlush() {
        int[] arr = new int[] {1,2,3,4,5};
        ArrayHolder arrayHolder = new SimpleArrayHolder(arr);

        ArrayHolderAdapter arrayHolderAdapter = null;
        arrayHolderAdapter.add(6);
        arrayHolderAdapter.add(7);
        Assert.assertEquals(new int[]{1,2,3,4,5}, arrayHolder.getArray());
    }
}
