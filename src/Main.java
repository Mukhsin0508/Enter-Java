//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//public class Main {
//    public static void main(String[] args) {
//                double num1 = 10;
//                double num2 = 3;
//                double res1 = num1/num2;
//                double res2 = num1 * num2;
//                double res3 = num1 - num2;
//                double res4 = num1 + num2;
//                System.out.println(res1);
//                System.out.println(res2);
//                System.out.println(res3);
//                System.out.println(res4);
//                double res5 = num1 % num2;
//                System.out.println(res5);
//            }
//}

//import java.util.Scanner;
//
//public  class Main {
//    public static void  main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        String message = input.next();
//
//        System.out.println(message);
//    }
//}

//import java.util.Scanner;
//
//public  class Main {
//    public static void main(String[] args) {
//        byte smallestNumber;
//        short shortNumber;
//        int numbers;
//        long Integer;
//        float smallerDouble;
//        double biggestVariable;
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter byte number: ");
//        smallestNumber = input.nextByte();
//        System.out.println("Enter a short number");
//        shortNumber = input.nextShort();
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        double radius;
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the value for radius: ");
//        radius = input.nextDouble();
//
//        double area = Math.PI * Math.pow(radius, 2);
//        System.out.println("Area for the circle is: " + area);
//        // pow(a, 2) is equal to ** in Python
//    }
//}

// Array Initializers

// Loops
//public class Main {
//    public static void main(String[] arg) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int i = arr.length -1;
//
//        while ( i >= 0) {
//            System.out.print(arr[i] + " ");
//            i--;
//        }
//        // System.out.println(i);
//    }
//}


//public class Main {
//    public static void main(String[] arg) {
//        int myNum = 15;
//        System.out.println(myNum);
//    }
//}

//public class Main {
//    public static void main(String[] arg) {
//        int myNum;
//        myNum =15;
//        System.out.println(myNum);
//    }
//}

//public class Main {
//    public static void main(String[] arg) {
//        int[] arr = {10, 3, 24, 2, 3, 44, 5, 7, 2, 19};
//
//        int middle = arr.length/2;
//
//        int right = middle;
//        int left = middle;
//
//        while(left >= 0 || right < arr.length) {
//            if (left >= 0) {
//                System.out.print(arr[left] + " ");
//                left++;
//            }
//            if (right < arr.length && right != left + 1) {
//                System.out.print(arr[right] + " ");
//                right--;
//            }
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] arg ) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter integers (type 'done to finish it: ");
//
//        int sum = 0;
//        // int num = 0;
//        while (scanner.hasNext()) {
//            if (scanner.hasNextInt()) {
//                sum += scanner.nextInt();
//            } else {
//                String input = scanner.next();
//                if (input.equalsIgnoreCase(anotherString: "Done"))
//            }
//        }
//}


//import java.util.Scanner;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        //Given String from which we would like to count a character's occurrences
//        System.out.print("Enter a string: ");
//        String str = scanner.nextLine(); //"Hello Guys I do not know what to write here, so imagine that there is something quite interesting";
//
//        // Prompt the user to enter a character
//        System.out.print("Enter a character to count its occurrences: ");
//        char characterToCount = scanner.next().charAt(0);//e
//
//        // Count occurrences
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == characterToCount) {
//                count++;
//            }
//        }
//
//        // Display the result
//        System.out.println("The character '" + characterToCount + "' appears " + count + " times in the given string.");
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        String input = "Hello World! This is a Test String.";
//        int upperCaseCount = 0;
//        int lowerCaseCount = 0;
//
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//            if (Character.isUpperCase(ch)) {
//                upperCaseCount++;
//            } else if (Character.isLowerCase(ch)) {
//                lowerCaseCount++;
//            }
//        }
//
//        System.out.println("Uppercase letter: " + upperCaseCount);
//        System.out.println(("Lowercase letter: " + lowerCaseCount));
//
//    }
//}