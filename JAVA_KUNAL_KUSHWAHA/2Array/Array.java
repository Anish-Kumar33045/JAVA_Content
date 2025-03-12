import java.util.Arrays;
import java.util.Scanner;

class Array{
    public static void main(String[] args) {
      
      // syntax 
      // DataType [] variable_name = new DataType[size];
      // array is homogeneous variable (same Datatype)

      int[] array = new int[5];
      int[] array1 = {23,45,67,89,56}; // two ways of declaring array

      // int --> data type 
      // array --> reference variable
      // new int[5]; ---> creating object in heap memory
      // Dynamic memory allocation ---> at the run time the memory is allocated .

      Scanner in = new Scanner(System.in);
      System.out.println("enter the size of array ");
       int size = in.nextInt();

      int[] arr = new int[size];

      // input using for loop
      
      System.out.println(" enter the elements of Array : ");

      for( int i =0 ; i<arr.length ; i++){
        arr[i] = in.nextInt();
      }
        System.out.println();   

      for( int i =0 ; i<arr.length ; i++){
        System.out.print(arr[i] + " ");
      }
        System.out.println();   

      // using enhanced for loop 

      for(int num : arr ){  // for every element in array , print the element 
        System.out.println(num + " ");   // num represents the element in the array
      }
        System.out.println(); 

        System.out.println(Arrays.toString(arr));  
       
    }
}