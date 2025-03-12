
import java.util.Scanner;

class SearchRange{
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
     System.out.println("Enter the low limit of range ");
         int a = in.nextInt();

     System.out.println("Enter the higher limit of range ");
         int b = in.nextInt();
        
         if (a>=0 && a<=n && b>=0 && b<=n) {
             
             int ans = Range(arr,m,a,b); //call the function
             if (ans == 1 ){
                System.out.println("Entered element is found ");
               }
               else if (ans == -1){
                System.out.println("Element is not found ");
               }
               else {
                System.out.println("invalid size ");
               }
                  
         }
         else{
            System.out.println("entered limit is invalid ");
         }

      
  
       
    }
    static int Range(int[] arr, int m ,int start , int end){
          
       for (int i = start ; i <= end ; i++) {
           if(arr[i]==m){
            System.out.println("element found at position "+ (i+1));
            return 1 ;
           }
       }
         return -1;
       
        
    }
}