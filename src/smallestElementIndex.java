import java.util.Scanner;

public class smallestElementIndex {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        // Promt the user to enter 10 numbers
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Find the index of the smallest element
        int minIndex = indexOfSmallestElement(numbers);

        // Display the index
        System.out.print("The index of the smallest element is: " + minIndex);
    }

    public  static  int indexOfSmallestElement(double[] numbers) {
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;

    }
}
