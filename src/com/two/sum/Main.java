package com.two.sum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int target = 5;
        int[] nums = new int[]{2, 4, 6, 7, 8, 3, 5};
        System.out.println("Index of numbers that add up to target: " + target);
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    //Performance = On(^2)
    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }




}
