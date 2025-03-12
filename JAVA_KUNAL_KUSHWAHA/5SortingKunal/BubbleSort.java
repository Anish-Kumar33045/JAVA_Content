/*
 * 
 * Bubble sort is a simple sorting algorithm that works by repeatedly stepping 
 * through the list, comparing adjacent elements, and swapping them if they are
 *  in the wrong order. The process is repeated until the list is sorted. 
 * It is called "bubble sort" because smaller elements "bubble" to the top of 
 * the list.
 * 
 * Steps in Bubble Sort:
 * 
1)Start with the unsorted array.

2) Outer Loop: Iterate through the entire array multiple times (from the first element to the last). 
  Let this loop run n−1 times, where n is the length of the array.

3)Inner Loop: For each iteration of the outer loop:
Compare adjacent elements in pairs (from the first element to the second-last in the unsorted section).
If the current element is greater than the next element, swap them.

4)After each pass (iteration of the outer loop):
The largest element in the unsorted section "bubbles up" to its correct position at the end of the array.
Reduce the range of comparison for the next pass by excluding the sorted part.

5)Repeat Steps 3-4 until no swaps are needed in a pass, meaning the array is sorted.

6)End.

 */
 
import java.util.Arrays;

// in the bubble sort the order is also maintained 
// i.e 10 , 30 ,[20],[10],20
// this is sorted as 10, [10] , [20] , 20, 30 
// assume the [] are the numbers in different color  

class BubbleSort{
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        // run the steps n-1 times 
        for(int i = 0 ; i < arr.length ; i++){
            boolean swapped = false;
            // for each iteration the max element wiil come at last respective index
            for(int j = 1 ; j<arr.length-i ; j++){
                // swap if the element is smaller than the previous element 
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
             swapped = true;
                }
            }
             
            if(!swapped){
                System.out.println("Already Sorted ");
                break;
            }
        }
    }
}