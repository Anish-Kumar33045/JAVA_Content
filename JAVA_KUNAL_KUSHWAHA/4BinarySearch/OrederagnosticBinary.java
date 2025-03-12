import java.util.Scanner;

class OrderagnosticBinary{
    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
         int n = in.nextInt();

         int [] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the key element ");
        int key = in.nextInt();

       // check order
        String order = checkOrder(arr);
       if(order.equals("Unsorted")){
        System.out.println("Array is not Sorted and Binary search cannot be done");
       }

       else {
        boolean isAsc = order.equals(" Ascending ");
        //   isAsc is true then true value pass in binarySearch calling 
        // and the  ascending condition is running and viceversa

        boolean found = binarySearch( arr, key,  isAsc) ;

        if(found){
            System.out.println("Entered element is found in the array");
        }
        else {
            System.out.println("Entered element is not found in the array");

        }
       }
          in.close();

    }

          // binary searching 
     static boolean binarySearch(int[] arr , int key , boolean isAsc) {
            
            int low = 0 , high = arr.length-1;

            while(low <= high){

                int mid = low + (high - low ) / 2;
                if(arr[mid]==key){
                    return true ;
                }

                else if(isAsc){
                    if(arr[mid]<key){
                        low = mid + 1;
                    }
                    else {
                        high = mid - 1 ;
                    }
                }

                else {
                    if(arr[mid]>key){
                        low = mid + 1;
                    }
                    else {
                        high = mid -1 ;
                    }
                }
            }
            return false;
     }

    
// to check whether the array is sorted in ascending or decending order 
    static String checkOrder(int[] arr){
        boolean isAsc = true ;
        boolean isDes = true ;

        for (int i = 1 ; i < arr.length; i++) { // here i=0 from start then out of bound error .
            if(arr[i] < arr[i-1]){
                isAsc=false; 
            }

            if(arr[i] > arr[i-1]){
                isDes=false;
            }
        }
        
        if(isAsc){
            return " Ascending ";
        }
        else if (isDes){
            return " Descending ";
        }
        else {
            return " Unsorted ";
        }
    }
}