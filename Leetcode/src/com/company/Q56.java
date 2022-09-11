package com.company;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q56 {

    public static void main(String[] args) {
//        int[][] arr= {{1,3},{2,6},{8,10},{15,18}};
//        merge(arr);

        Pair<Integer, String> p = new Pair<>(5 ,"Five");
        System.out.println(Arrays.toString(arr));
    }

    static public int[][] merge(int[][] intervals) {

        if (intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> ans = new ArrayList<>();

        int[] newInterval = intervals[0];
        ans.add(newInterval);
        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1])
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            else {
                newInterval = interval;
                ans.add(newInterval);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }


}
