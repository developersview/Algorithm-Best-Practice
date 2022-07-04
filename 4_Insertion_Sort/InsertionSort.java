//Insertion sort algorithm implementation
public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // element at 1 postion for 1st time run
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    // driver code
    public static void main(String[] args) {
        int[] array = { 12, 11, 13, 5, 6 };
        int[] result = insertionSort(array);
        for (int element : result) {
            System.out.printf(element + " ");
        }
    }
}