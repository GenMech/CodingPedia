package com.company;

public class Matrix {

    public static void main(String[] args) {
        int[][]matrix = {{1,2,3,4},
                         {5,1,2,3},
                         {9,5,1,2}};
        int m = matrix.length;

        for(int i = m-1; i >= 1; i--){
            for(int j = 0; j < matrix[i].length-1; j++){
                if(matrix[i-1][j] != matrix[i][j+1]){
                    System.out.println(false);
                }
            }
        }
        System.out.println(true);
    }

}
//for(int i = 1; i < matrix.length; i++){
//        for(int j = 1; j < matrix[i].length; j++){
//        if(matrix[i][j] != matrix[i-1][j-1]){
//        System.out.println(false);
//        }
//        }
//        }