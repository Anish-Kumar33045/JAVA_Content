/*
 * Selection Sort Definition:
Selection Sort is a sorting algorithm that divides the array into a sorted
 and an unsorted part. It repeatedly selects the smallest element from the
  unsorted part and places it at the beginning of the sorted part.


Steps to Remember Selection Sort:
1) Outer loop: Start from the first element and move towards the second-last element. This marks the boundary of the sorted and unsorted portions.

2) Find the minimum: Use an inner loop to find the smallest element in the unsorted portion of the array.

3) Swap: Swap the smallest element found with the first element of the unsorted portion.

4) Expand the sorted portion: The sorted part of the array grows by one element after each iteration.

5) Repeat: Continue until the entire array is sorted.
 */
import java.util.Arrays;

class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,89,54,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr ){

        for(int i = 0; i<arr.length ; i++){

            int last = arr.length - i - 1 ;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr , maxIndex , last);
        }
        
    }

    static int getMaxIndex(int[] arr , int start , int end){
            int max = start;
        for(int i = start ; i <=end ; i++){
            if(arr[max]<arr[i]){
                max = i ;
            }
        }
        return max;
    }

    static void swap (int[] arr, int first , int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
}