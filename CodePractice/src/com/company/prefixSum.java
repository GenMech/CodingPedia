package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class prefixSum {

    // Leetcode: 209. Minimum Size Subarray Sum
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;

        int start = 0;
        int val_sum = 0;
        int result = Integer.MAX_VALUE;

        for(int end = 0; end < arr.length; end++){
           val_sum += arr[end];

           while(val_sum >= target){
               int winSize = end+1 - start; // window size
               result = Math.min(result, winSize);
               val_sum -= arr[start];
               start++;
           }
        }
       if(result != Integer.MAX_VALUE){
           System.out.println(result);
       }else System.out.println('0');
    }
}
