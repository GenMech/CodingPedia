package com.company;

import java.util.Arrays;

public class Q283 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }

    static public void moveZeroes(int[] nums) {
        int n = nums.length;
        int arr[]= new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                arr[j++] = nums[i];
            }
            nums[i]=0;
        }
        for(int i=0;i<n;i++){
            nums[i] = arr[i];
        }
//        System.out.println(nums);

        }



}

