//Bubble sort Algorithm implementation
public class BubbleSort {
    //Ascending Order
    public int[] bubbleSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    //Descending Order
    public int[] bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {8, 9, 6, 10, 1, 2};
        BubbleSort bs = new BubbleSort();
        int[] result1 = bs.bubbleSortAscending(array);
        for (int element : result1) {
            System.out.printf(element + " ");
        }
        System.out.println();
        int[] result2 = bs.bubbleSortDescending(array);
        for (int element : result2) {
            System.out.printf(element + " ");
        }

    }
}