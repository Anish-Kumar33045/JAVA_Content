import java.util.Scanner;
class SearchIn2DArray{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [][] arr = {  // intialisation of array 
            {23,45,6},
            {45,82,62},
            {78,52,10,22,23}
        };

        System.out.println(" enter the target ");
        int target = in.nextInt();

        System.out.println(search2D(arr,target));



    }
    
    // using string makes our job easy ...
    static String search2D(int[][] arr , int key){
        // rows = arr.length
        // cols = arr[i].length
       for(int i = 0 ; i < arr.length ; i ++){
        for (int j = 0 ; j < arr[i].length ; j++){    // 2D array is : array of array // cols is need not to be mentioned 
           if ( arr[i][j] == key){
            return "element found ";
           }
        }
       }
       return "element not found ";
      

    }
}