package com.company;

public class Paindrom {

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

    static boolean isPali(int n){
        return n == Rev2(n);
    }
    public static void main(String[] args) {
        System.out.println(isPali(1234321));
    }
}
