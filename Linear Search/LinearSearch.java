//Linear Search Algorithm implementation
public class LinearSearch {
    public int linearSearch(int[] arr, int x) {
        if (arr.length == 0 || arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {5, 8, 6, 1, 9, 10};
        int key = 14;
        LinearSearch ls = new LinearSearch();
        int result = ls.linearSearch(array, key);
        if (result != -1) {
            System.out.println("The number " + key + " is in the position of : " + result);
        } else {
            System.out.println("The number " + key + " is not present in the array");
        }
    }
}
