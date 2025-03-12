/*
 * /*
 *1) Outer loop: Start from the second element (index 1) since the first element is already sorted. Move through the array from left to right.

 2)Pick the key: The current element is the "key" to be placed in the sorted portion of the array.

 3)Inner loop: Compare the key with elements in the sorted portion (to its left) by iterating backward.

 4)Shift elements: Move each element that is larger than the key one position to the right to make space.

 5)Insert the key: Place the key in the correct position in the sorted portion.

 6)Repeat: Continue this process until the last element is placed in its correct position, ensuring the entire array is sorted.


 */

 */
import java.util.Arrays;

// best case time complexity is O(N)
// worst case time complexity is O(N^2)

// why we use ??
//    Adaptive : steps get reduced if array is sorted 
// number of swaps reduced comparedd to bubble Sort
// stable 
// used for smaller values of  n 
// works good when the array is partially sorted , so it is used in hybdrid 
// sorting algorithms 


class InsertionSort{
    public static void main(String[] args) {
        int[] arr = {5,3,7,1,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[]arr){
     for (int i = 0; i < arr.length-1; i++) {
         for (int j = i+1 ; j >0; j--) {
             if(arr[j]<arr[j-1]){
                swap(arr,j, j-1);
             }
             else {
                break;
             }
         }
     }

    }

    static void swap(int[]arr, int first , int second ){
          int temp = arr[first];
          arr[first]=arr[second];
          arr[second]=temp;
    }
}