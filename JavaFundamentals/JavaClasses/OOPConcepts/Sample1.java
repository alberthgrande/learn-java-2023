package JavaFundamentals.JavaClasses.OOPConcepts;

import java.util.Scanner;

public class Sample1 {
    public static void main(String[] args) {
        // pre-defined method
        System.out.println("Max number: " + Math.max(100,101));
        Scanner input = new Scanner(System.in);
        System.out.print("Find if Odd or Even: ");
        int number = input.nextInt();
        System.out.print("Enter a number to sum: ");
        int number1 = input.nextInt();
        oddEven(number);
        int sum = addition(number, number1);
        System.out.println("Sum is: " + sum);

    }

    // user-defined method
    public static void oddEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        }
        else {
            System.out.println(number + " is odd number");
        }
    }

    public static int addition(int number1, int number2) {
        return number1 + number2;
    }
}
