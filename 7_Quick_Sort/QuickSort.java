public class QuickSort {

    // A utility fucntion to swap two elements
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /*
     * This function takes last element as pivot, places
     * the pivot element at its correct position in sorted
     * array, and places all smaller (smaller than pivot)
     * to left of pivot and all greater elements to right
     * of pivot
     */
    static int partition(int[] arr, int low, int high) {
        // pivot
        int pivot = arr[high];

        // index of smaller element
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            /*
             * If current element is smaller
             * than the pivot
             */
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    // quicksort function
    static void quickSort(int[] arr, int low, int high) {
        if (low <= high) {
            int pivot_index = partition(arr, low, high);
            quickSort(arr, low, pivot_index - 1);
            quickSort(arr, pivot_index + 1, high);
        }

    }

    // driver code
    public static void main(String[] args) {
        int[] array = { 64, 25, 12, 22, 11, 10, 89, 15, 2, 101, 56, 45, 19, 34 };
        quickSort(array, 0, array.length - 1);
        for (int element : array) {
            System.out.printf(element + " ");
        }
    }
}