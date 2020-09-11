package com.uequations.compute;

import java.util.Arrays;
import java.util.function.Function;

public class RunningSum implements Function<int[], int[]> {

    public int[] apply(int[] nums) {

        int[] outputArray = new int[nums.length];

        outputArray[0] = nums[0];

        for (int i = 1; i < outputArray.length; i++) {
            outputArray[i] = outputArray[i - 1] + nums[i];
        }

        System.out.println(Arrays.toString(outputArray));

        return outputArray;
    }
}
