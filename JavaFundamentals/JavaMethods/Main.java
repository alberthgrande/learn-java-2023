package JavaFundamentals.JavaMethods;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Main Methods");
        JavaMethods jMethods = new JavaMethods();
        JavaMethods jMethods1 = new JavaMethods();
        int sum = jMethods.addTwoInt(1,2);
        System.out.println("Sum of two integer value: " + sum);

        System.out.println();

        int m1 = jMethods.m1();
        System.out.println("Control returned after m1: " + m1);
        System.out.println("\n");
        int m11 = jMethods1.m1();
        System.out.println("Control returned after m1: " + m11);

        int no_of_objects = JavaMethods.get();

        System.out.println("No of instances created till now : " + no_of_objects);
    }
}
