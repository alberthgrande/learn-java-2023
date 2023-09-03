package JavaFundamentals.JavaClasses.Classes;

public class AnonymousObject {

    public void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
    public static void main(String[] args) {
        new AnonymousObject().factorial(5);
    }

}
