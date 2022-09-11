package com.company;

public class Q122 {
    public static void main(String[] args) {

        int[] arr = {7,1,5,3,6,4};
        int ans = maxProfit(arr);
        System.out.println(ans);

    }

    static public int maxProfit(int[] prices) {

        int profit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                profit += prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}