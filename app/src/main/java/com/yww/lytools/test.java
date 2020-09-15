package com.yww.lytools;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(twoSum(nums,5));
    }

    public static int[] twoSum(int[] nums, int target) {
        int count = nums.length;
        for (int i = 0; i < count; i++) {
            int num = target - nums[i];
            for (int j = 0; j < count; j++) {
                if (i != j && nums[j] == num) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
