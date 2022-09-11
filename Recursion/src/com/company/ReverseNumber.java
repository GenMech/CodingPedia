package com.company;

public class ReverseNumber {

    // in this method we taking sum out
    static int sum = 0;
    static void Rev1(int n) {
        if (n == 0) return;

        int rem = n % 10;
        sum = sum * 10 + rem;
        Rev1(n / 10);
    }

    static int Rev2(int N){
    int digits = (int)(Math.log10(N) + 1);
    return helper(N , digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n){
            return n;
        }
        int Rem = n % 10;
        return Rem * (int)(Math.pow(10, digits - 1)) + helper(n/10, digits - 1);
    }

    public static void main(String[] args) {
       System.out.println(Rev2(1234));
    }


}
