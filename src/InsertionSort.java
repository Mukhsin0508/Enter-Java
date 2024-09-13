import java.util.Arrays;

public class InsertionSort {
    public static void numbers(Integer[] arr, int n) {
        int i, key, j;

        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5, 4, 3, 2, 1};
        System.out.println("Original array: " + Arrays.toString(arr));
        numbers(arr, arr.length);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}