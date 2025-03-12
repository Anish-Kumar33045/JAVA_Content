public class SortedMatrix {
    public static void main(String[] args) {
        int arr[][] = {
            {10, 23, 34, 48},
            {56, 62, 73, 89},
            {97, 101, 111, 126},
            {134, 145, 150, 169},
        };
        int target = 10;
        int[] result = binarySearch2D(arr, target);

        if (result[0] == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at position: (" + result[0] + ", " + result[1] + ")");
        }
    }

    public static int[] binarySearch2D(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = rows * cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midElement = matrix[mid / cols][mid % cols];

            if (midElement == target) {
                return new int[]{mid / cols, mid % cols};
            } else if (midElement < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return new int[]{-1, -1}; // Element not found
    }
}
