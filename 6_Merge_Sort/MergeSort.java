//Merge Sort Implementation
public class MergeSort {

    //function to create and merge two subarray
    public void merge(int[] arr, int l, int m, int r) {
        //find size of two temp subarray to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        //create temp array
        int[] L = new int[n1];
        int[] R = new int[n2];

        //copy data to temp array
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        /*merge the temp arrays*/

        //initial index of 1st and 2nd subarray
        int i = 0, j = 0;
        //initial index of merged array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            k++;
            i++;
        }

        //copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            k++;
            j++;
        }
    }

    //function for sorting the array
    public void sort(int[] arr, int l, int r) {
        if (l < r) {
            //find the mid point
            int m = (l + r) / 2;

            //sort the 1st and 2nd half values
            sort(arr, l, m);
            sort(arr, m + 1, r);

            //merge two subarray
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11, 10, 89, 15, 2, 101, 56, 45};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.length - 1);
        for (int element : array) {
            System.out.printf(element + " ");
        }
    }
}