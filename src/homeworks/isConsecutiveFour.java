package homeworks;

import java.util.Scanner;

public class isConsecutiveFour {
    public static Boolean consecutivefour(int[] values){
        int count = 1; // number of consecutive numbers

        for (int i = 0; i < values.length; i++){
            if (values[i] == values[i+1]) {
                count++;
                if (count >=4 ) {
                    return true;
                }
            }
            else {
                count = 1;
            }
        }
        return false;
    }

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of values
        System.out.print("Enter the number of values: ");
        int numberOfValues = scanner.nextInt();


        int[] values = new int[numberOfValues]; // create an array to hold the values

        // Prompt the user to enter the values
        System.out.print("Enter the values: ");
        for (int i = 0; i < numberOfValues; i++) {
            values[i] = scanner.nextInt();
        }

        // Check if there are four consecutive numbers
        if (consecutivefour(values)) {
            System.out.println("The list has four consecutive numbers.");
        } else {
            System.out.println("The list does not have four consecutive numbers.");
        }

    }
}
