package com.company;

public class Profit {

    public static void main(String[] args) {

        int[] arr = {2,4,1};
        int ans = maxProfit(arr);
        System.out.println(ans);

    }

        static int maxProfit(int[] prices) {
            int min = prices[0];
            int profit = 0;
            int s = 0;

            for(int i = 0; i < prices.length; i++){
                if(prices[i] < min){
                    min = prices[i];
                }
                s = prices[i] - min;
                if(s > profit){
                    profit = s;
                }
            }
            return profit;
        }
}

