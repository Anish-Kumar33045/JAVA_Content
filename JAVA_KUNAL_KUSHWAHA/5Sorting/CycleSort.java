public class CycleSort {
    public static void cycleSort(int[] arr) {
        int n = arr.length;

        for (int cycleStart = 0; cycleStart < n - 1; cycleStart++) {
            int item = arr[cycleStart];

            // Find the correct position for the item
            int pos = cycleStart;
            for (int i = cycleStart + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }

            // If the item is already in the correct position
            if (pos == cycleStart) {
                continue;
            }

            // Skip duplicates
            while (item == arr[pos]) {
                pos++;
            }

            // Put the item in its correct position
            if (pos != cycleStart) {
                int temp = arr[pos];
                arr[pos] = item;
                item = temp;
            }

            // Rotate the rest of the cycle
            while (pos != cycleStart) {
                pos = cycleStart;
                for (int i = cycleStart + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }

                // Skip duplicates
                while (item == arr[pos]) {
                    pos++;
                }

                // Swap the item with the element at its correct position
                if (item != arr[pos]) {
                    int temp = arr[pos];
                    arr[pos] = item;
                    item = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 5};
        System.out.println("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        cycleSort(arr);

        System.out.println("\nSorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
