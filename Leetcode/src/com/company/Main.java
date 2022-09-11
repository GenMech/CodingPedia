package com.company;
public class Main {

    public static void main(String[] args) {
     Pattern5(5);
    }
//    static void Pattern3(int n) {
//        for (int row = 1; row <= n; row++) {
//            for (int col = n; col >= row; col--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//        This is Kunal Approach for Pattern 3
//
//        static void Pattern3(int n){
//            for (int row = 1; row <= n; row++) {
//                for (int col = 1; col <= n-row+1 ; col++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }

//    static void Pattern4(int n) {
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }
//    }

    static void Pattern5(int n) {
        int row,col;
        for ( row = 1; row <= n; row++) {
            for ( col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for ( row = 1; row <= n; row++) {
                for ( col = n-1 ; col >= row; col--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
}

