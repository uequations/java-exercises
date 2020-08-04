package com.uequations.compute;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void test1() {
        int[] arr = {2, 4, 6, 10, 40};
        int k = 10;
        int idx = new BinarySearch().binarySearch(arr, k);
        Assert.assertTrue("value is: " + idx, idx == 3);
    }
}
