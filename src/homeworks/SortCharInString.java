package homeworks;//import java.util.Scanner;
//
//public class homework {
//    public static String sort(String s){
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompted a String by the User from which we will sort the String
//        System.out.print("Enter a string to sort it out: ");
//        String str = scanner.nextLine();
//
//        // Sort out the String
//        String sortedStr = sort(str);
//
//        // Display the sorted string
//        System.out.print("The Sorted String is " + str);
//
//        return str;
//    }
//}

// Selection sort
// Insertion sort

import java.util.Scanner;

public class SortCharInString {
    public static String sort(String s) {
        // Convert the string to a char array
        char[] charArray = s.toCharArray();
        // Sort the char array
        java.util.Arrays.sort(charArray);
        // Convert the sorted char array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string to sort
        System.out.print("Enter a string to sort it out: ");
        String str = scanner.nextLine();

        // Sort the string
        String sortedStr = sort(str);

        // Display the sorted string
        System.out.println("The sorted string is: " + sortedStr);
    }
}


// Homerwork : 5, 6, 7, 