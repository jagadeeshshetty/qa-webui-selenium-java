package com.jc.core.arrays;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

//        int[] nums = {5, 6, 7, 8, 9};

//        System.out.println(nums[2]);
//        System.out.println(nums.length);
//        System.out.println(nums[6]);

        int[] nums = new int[5];
        System.out.println(nums.length);
        nums[0] = 10;
        nums[4] = 40;

        System.out.println(Arrays.toString(nums));

//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
    }
}
