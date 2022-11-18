package com.company;

public class PrimeFactor {
    public static void main(String[] args) {
        int n = 8;
        for(int i = 2; i < n; i++){
            while(n % i == 0){
                System.out.println(i);
                n = n / i;
            }
        }

        if(n > 2){
            System.out.println(n);
        }
    }
}
