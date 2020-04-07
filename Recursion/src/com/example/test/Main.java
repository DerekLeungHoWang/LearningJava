package com.example.test;

import java.util.Arrays;

public class Main {

    public static int[] removeDuplicate(int[] nums) {
        int[] tempArray = new int[nums.length];

        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int currentElement = nums[i];
            if (currentElement != nums[i + 1]) {
                tempArray[j++] = currentElement;
            }
        }

        tempArray[j++] = nums[nums.length - 1];
        return tempArray;

    }

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2,1, 2, 3, 3, 4, 5, 5};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


        int[] tempArray = removeDuplicate(nums);
        System.out.println(Arrays.toString(tempArray));
    }


}
