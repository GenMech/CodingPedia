package com.company;

import java.util.Arrays;

public class Q977 {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        sortedSquares(arr);
        System.out.println(Arrays.toString(arr));
    }

    static public void sortedSquares(int[] nums){

        for (int i = 0; i < nums.length ; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int n = nums.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (nums[j] > nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

    }

}
