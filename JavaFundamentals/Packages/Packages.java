package JavaFundamentals.Packages;
import JavaFundamentals.ImportPackages.PackagesA;
public class Packages {
    public static void main(String[] args) {

        PackagesA packagesA = new PackagesA();
        packagesA.helloWorld();

        // Example of package by import fully qualified name
        JavaFundamentals.ImportPackages.PackagesA objA = new JavaFundamentals.ImportPackages.PackagesA();
        objA.qualifiedName();


    }
}
