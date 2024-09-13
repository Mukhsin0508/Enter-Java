import java.util.Arrays;

public class ArraySorted {
    public static void numbers(Integer[] arr, int n) {
        System.out.println(arr.length);

        int i, key, j;

        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i-1;
            while ( j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 89, 10, 5, 4}; // Expected output 1, 2, 4, 5, 10, 89
        System.out.print("Original Array: " + Arrays.toString(arr));
        numbers(arr, arr.length);
        System.out.print("\nSorted Array: " + Arrays.toString(arr));

    }
}
