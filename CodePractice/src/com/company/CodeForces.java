package com.company;

import java.util.Scanner;

public class CodeForces {
    public static void main(String[] args) {

        // CodeForces Div - 2 (B. Bright, Nice, Brilliant)
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc-- > 0){
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    if(j == 1 || j == i){
                        System.out.print("1" + " ");
                    }else System.out.print("0" + " ");
                }
                System.out.print("\n");
            }
        }
    }
}
