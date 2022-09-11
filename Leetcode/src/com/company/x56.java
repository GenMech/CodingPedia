package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class x56 {

    public static void main(String[] args) {
        int[][] arr= {{1,3},{2,6},{8,10},{15,18}};
        merge(arr);
        System.out.println(Arrays.toString(arr));
    }

    static public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        ArrayList<int[]> list = new ArrayList<>();

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int A=intervals[0][0]; //Start
        int B=intervals[0][1]; //End

        for(int[] i:intervals){

            if(i[0]<=B)
            {
                B = Math.max(B,i[1]);
            }

            else{
                list.add(new int[]{A,B});
                A=i[0];
                B=i[1];
            }

        }
        list.add(new int[]{A,B});
        return list.toArray(new int[0][]);
    }
}
