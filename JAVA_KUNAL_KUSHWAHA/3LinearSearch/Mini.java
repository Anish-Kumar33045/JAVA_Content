// finding minimum number in array 
// similarly maximun can be found 

import java.util.Scanner;

class Mini{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int size = in.nextInt();
         
         int[] arr = new int[size];
        System.out.println("enter the elements in array ");
        for(int i=0; i<size ; i++){
            arr[i] = in.nextInt();
        }
         
         // calling minimum element function

        System.out.println("Minimum number is : " + minimum(arr));
        
        System.out.println("Maximum number is : "+maximum(arr));
    }

        static int minimum (int[] arr ){
            int mini = arr[0]; // assume the minimum element is the first element of array 
            // otherwise use Integer.MIN_VALUE 
            for(int i = 0; i < arr.length ; i ++){
                 if(arr[i]<mini){
                    mini = arr[i];
                 }
            }
            return mini;
        }
        
         static int maximum (int[] arr ){
            int max = arr[0]; //assume the first element as maximun
            // or use Integer.MAX_VALUE
            for(int i = 0; i < arr.length ; i ++){
                 if(arr[i]>max){
                    max = arr[i];
                 }
            }
            return max;
        }

}