package com.uequations.compute;

public class BinarySearch {

    public int binarySearch(int[] a, int keyVal) {
        int lowIdx = 0;
        int highIdx = a.length - 1;

        while (lowIdx <= highIdx) {
            int midIdx = (lowIdx + highIdx) >>> 1;
            int midVal = a[midIdx];

            if (midVal < keyVal) {
                lowIdx = midIdx + 1;
            } else if (midVal > keyVal) {
                highIdx = midIdx - 1;
            } else
                return midIdx;
        }

        return -(lowIdx + 1);
    }
}
