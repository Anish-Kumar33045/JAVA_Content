
import java.util.Arrays;
import java.util.Scanner;

class Matrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][] = {
               {10,20,30,40},
               {23,33,43,53},
               {15,25,35,45},
               {21,22,23,24}

        };
        int key = scanner.nextInt();
        System.out.println(Arrays.toString(search(arr , key)));
        
    }

    static int[] search(int[][] matrix, int target){
        int row =0;
        int col = matrix.length - 1;

        while (row < matrix.length && col>=0){
            if(matrix[row][col] == target ){
                return new int[]{row,col};
            }
            else if (matrix[row][col]<target ){
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}