package JavaFundamentals;

import java.util.Scanner;

public class JavaFundamentals {
    public void basicSyntax() {

        System.out.println("// single line comment" +
                "\n" +
                "/* multiline comment */" +
                "\n");
    }

    public void dataTypesVariables() {
        System.out.println("Variable Declaration:" +
                "\n" +
                "int count;" +
                "\n" +
                "int => type" +
                "\n" +
                "cout => name" +
                "\n");
        System.out.println("Variable Initialization:" +
                "\n" +
                "count = 100;" +
                "\n" +
                "Combination of declaration and initializaion" +
                "\n" +
                "int count = 100;" +
                "\n");

        System.out.println("Types of variables" +
                "\n" +
                "Local Variables" +
                "\n" +
                "Instance Variables" +
                "\n" +
                "Static Variables");
    }

    public void primitiveDataTypes() {
        System.out.println("Integer data types" +
                "\n" +
                "byte (1 byte)\n" +
                "short (2 bytes)\n" +
                "int (4 bytes)\n" +
                "long (8 bytes)");
        System.out.println("Floating Data Type" +
                "\n" +
                "float (4 bytes)\n" +
                "\n" +
                "double (8 bytes)");
        System.out.println("Textual Data Type" +
                "\n" +
                "char (2 bytes)");
        System.out.println("Logical" +
                "\n" +
                "boolean (1 byte) (true/false)");
    }

    public void typeCasting() {
        double d;
        int i = 10;
        d = i;

        System.out.println(i);
        System.out.println(d);

        byte x;
        int a = 270;
        double b = 128.128;
        System.out.println("int converted to byte");
        x = (byte) a;
        System.out.println("a and x " + a + " " + x);
        System.out.println("double converted to int");
        a = (int) b;
        System.out.println("b and a " + b + " " + a);
        System.out.println("\ndouble converted to byte");
        x = (byte)b;
        System.out.println("b and x " + b + " " + x);
    }

    public void ifConditionals() {
        System.out.println("if condition:");
        int age = 20;
        if (age > 18) {
            System.out.println("Age is greater than " + age);
        }
        System.out.println();
    }

    public void ifElseConditionals() {
        System.out.println("if-else condition:");
        int number = 13;
        if(number % 2 == 0) {
            System.out.println("even number");
        }else {
            System.out.println("odd number");
        }
        System.out.println();
    }

    public void leadYear() {
        System.out.println("Leap Year:");
        int year = 2020;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Common Year");
        }
        System.out.println();
    }

    public void ternaryOperator() {
        System.out.println("Ternary Operator");
        int divisible = 13;
        String ouput = (divisible % 2 == 0) ? "even number" : "odd number";
        System.out.println(ouput);

        System.out.println();
    }

    public void ifElseIfCondition() {
        System.out.println("if-else-if condition:");
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input grade: ");
        int grade = 100;

        if (grade < 50) {
            System.out.println("fail!");
        } else if (grade >= 50 && grade < 60) {
            System.out.println("D grade");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("C grade");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("B grade");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("A grade");
        } else if (grade >= 90 && grade <= 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("invalid!");
        }
        System.out.println();
    }

    public void positiveNegativeZero() {
        System.out.println("Positive, Negative, or Zero:");
        int number = 100;
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        System.out.println();
    }

    public void nestedIf() {
        System.out.println("Nested if statement:");
        int age = 20;
        int weight = 60;

        if (age >= 18) {
            if (weight > 66) {
                System.out.println("You are eligible to donate blood.");
            } else {
                System.out.println("You are not eligible to donate blood.");
            }
        } else {
            System.out.println("Your age must be greater than 18.");
        }
        System.out.println();
    }
}
