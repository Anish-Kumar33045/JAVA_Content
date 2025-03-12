
import java.util.Arrays;
import java.util.Scanner;

class TwoD {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        /*
         2D array is matrix 
        
        syntax 

        datatype[][] = new datatype[rows][colns] ;

        number of cloumns is need not to be specified 

        below   arr[ 0] = { 2,3,4}
                arr[0][1] = 3 
        
         */
           
          int[][] arr = new int[3][3];

        // int[][] arr1 = { 
        //                  {2,3,4} , {5,6,7} , {8,9,0}  
          
        // };
        
        // int[][] arr2 = { 
        //                  {2,3,4} , {5,6} , {8,9,0,7}  // number of col varies here
          
        // };
        

        // taking input of 2 D array by for loop

    //     for ( int row = 0 ; row < arr.length ; row ++){
    //         for (int col = 0 ; col < arr[row].length ; col++){
    //             arr[row][col] = in.nextInt();
    //         }
    //     }
     
    //  // printing the array
    //     for ( int row = 0 ; row < arr.length ; row ++){
    //         for (int col = 0 ; col < arr[row].length ; col++){
    //             System.out.print(arr[row][col]+" ");
    //         }
    //             System.out.println();
            
    //     }

    // it can also written as 

    // for ( int row = 0 ; row < arr.length; row ++){
    //     System.out.println(Arrays.toString(arr[row]));
    // }

        //  using the enhanced for loop
        for(int [] a : arr){  // for every inside array in the  outer array 
            System.out.println(Arrays.toString(a));
        }


    }
    
}