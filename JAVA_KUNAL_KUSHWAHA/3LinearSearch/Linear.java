
import java.util.Scanner;

class Linear{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

     System.out.println("Enter the size of array ");

     int n = in.nextInt();   

     int[] arr = new int[n];

     System.out.println("Enter the elements of array ");
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
          
     System.out.println("Enter the element to be searched ");
         int m = in.nextInt();
     
       int ans = linearSearch(arr,m);

       if (ans == 1 ){
        System.out.println("Entered element is found ");
       }
       else if (ans == -2 ){
        System.out.println("Element is not found ");
       }
       else {
        System.out.println("invalid size ");
       }
       
       // without functions
        //   int c = 0 ;
        // for (int i = 0; i < n; i++) {
        //     if(arr[i]==m){
        //         c=1;
        //       System.out.println("Element " + m +  " is found at position : " + (i+1) );
                
        //     }

        // }
        // if(c==0){
        //     System.out.println("Element is not found ");
        // }
       
    }

     //using functions 
    static int linearSearch(int [] arr, int m){
        
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]==m ){
            return 1 ;
           }
        }
        return -2 ;
    }
}