public class BinarySearch {
    // Binary Search Implementation with iterative approch
    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length-1;
        if (low > high)
            return -1;
        if (arr.length == 0)
            return -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == arr[mid]) {
                return mid;
            } else if (x < arr[mid]) { // x is on the left side
                high = mid - 1;
            } else { // x is on the right side
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] array = {1, 4, 6, 9, 10, 11};
        System.out.println(binarySearch(array, 11));
    }
}