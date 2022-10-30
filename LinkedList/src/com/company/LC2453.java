package com.company;

import java.util.HashMap;

public class LC2453 {
// https://leetcode.com/problems/destroy-sequential-targets/
    public static void main(String[] args) {
        int[] nums = {3,7,8,1,1,5};
        int space = 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            int remainder = i % space;
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        int max = 0;
        for(int j: map.values()){
            if(j > max){
                max = j;
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i: nums){
            int rem = i % space;
            if(map.get(rem) == max && i < min){
                min = i;
            }
        }
        System.out.println(min);
    }
}
