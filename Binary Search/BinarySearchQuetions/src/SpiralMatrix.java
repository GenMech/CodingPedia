import java.util.ArrayList;

// Spiral Matrix - 1
// Spiral Matrix - 2
public class SpiralMatrix {
    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3},
//                          {4,5,6},
//                          {7,8,9}};

//        print2D(matrix);

//        ArrayList<Integer> ans = new ArrayList<>();
        int n = 3;
        int[][] matrix = new int[n][n];

        int rowB = 0;
        int colB = 0;
        int rowE = matrix.length - 1;
        int colE = matrix[0].length - 1;
        int ele = 1;

        while(rowB <= rowE && colB <= colE && ele <= n*n){
            //traverse right
            for (int i = colB; i <= colE; i++){
                matrix[rowB][i] = ele++;
            }
            rowB++;

            //traverse down
            for(int j = rowB; j <= rowE; j++){
                matrix[j][colE] = ele++;
            }
            colE--;

            //traverse left
            if(rowB <= rowE){
                for (int k = colE; k >= colB; k--){
                    matrix[rowE][k] = ele++;
                }
            }
            rowE--;

            //traverse up
            if(colB <= colE){
                for(int l = rowE; l >= rowB; l--){
                    matrix[l][colB] = ele++;
                }
            }
            colB++;
        }
        print2D(matrix);
    }

    public static void print2D(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
