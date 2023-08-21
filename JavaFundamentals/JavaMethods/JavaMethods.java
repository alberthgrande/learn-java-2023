package JavaFundamentals.JavaMethods;

public class JavaMethods {

    public static int i = 0;
    // constructor
    JavaMethods() {
        i++;
    }
    int sum = 0;
    public int addTwoInt(int a, int b) {
        sum = a + b;

        return sum;
    }

    public static int get() {
        return i;
    }

    public int m1() {
        // Display message only
        System.out.println("Inside the method m1 by object of Main class");

        // Calling m2() method within the same class.
        this.m2();

        // Statements to be executed if any
        return 1;
    }

    public void m2()
    {
        // Print statement
        System.out.println(
                "In method m2 came from method m1");
    }
}
