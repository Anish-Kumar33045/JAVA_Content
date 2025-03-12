import java.util.Scanner;

public class BinarySearch{

    // Method to perform binary search
    public static int binarySearch(int[] arr, int key) {
        int low  = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // int mid = low + (high - low) / 2; // there might be possiblity , that sum of high and low may excced the range of int in java
            // it is better to go with this 
              int mid = low +(high - low )/2;

            // Check if the key is present at mid
            if (arr[mid] == key) {
                return mid; // Key found
            }

            // If key is greater, ignore low half
            if (arr[mid] < key) {
                low = mid + 1;
            } 
            // If key is smaller, ignore high half
            else {
                high = mid - 1;
            }
        }
        return -1; // Key not found
    }

    // Method to check if the array is sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false; // Array is not sorted
            }
        }
        return true; // Array is sorted
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the key to search for
        System.out.print("Enter the key to search for: ");
        int key = scanner.nextInt();

        // Check if the array is sorted
        if (isSorted(arr)) {
            // Perform binary search
            int result = binarySearch(arr, key);
            if (result == -1) {
                System.out.println("Element not found in the array.");
            } else {
                System.out.println("Element found at position : " + result + 1);
                System.out.println("Element found at index  : " + result );
            }
        } else {
            System.out.println("The entered element is not sorted.");
        }

        scanner.close();
    }
}
