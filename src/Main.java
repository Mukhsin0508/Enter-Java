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
//        long longIntegery;
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

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for radius: ");
        radius = input.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area for the circle is: " + area);
        // pow(a, 2) is equal to ** in Python
    }
}
