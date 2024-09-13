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

//
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {10, 2, 89, 1, 5, 4};
//        int[] sortedArr = selectionSort(arr);
//        System.out.println("Sorted array: ");
//        for (int num : sortedArr) {
//            System.out.print(num + " ");
//        }
//    }
//
//    public static int[] selectionSort(int[] arr) {
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            int minIndex = getMinIdx(arr, i);
//            // Swap the found minimum element with the first element
//            int temp = arr[minIndex];
//            arr[minIndex] = arr[i];
//            arr[i] = temp;
//        }
//        return arr;
//    }
//
//    public static int getMinIdx(int[] arr, int start){
//        int minIdx = start;
//
//        for(int i = start + 1; i < arr.length; i++){
//            if(arr[i] < arr[minIdx]){ minIdx = i;}
//        }
//        return minIdx;
//    }
//}