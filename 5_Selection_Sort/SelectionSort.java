//Selection Sort algorithm implementation
public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n; i++) {
            int min_index = i;
            // Find the minimum element in unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j]) min_index = j;
            }
            // Swap the found minimum element with the first element
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11, 10, 89, 15};
        int[] result = selectionSort(array);
        for (int element : result) {
            System.out.printf(element + " ");
        }
    }
}