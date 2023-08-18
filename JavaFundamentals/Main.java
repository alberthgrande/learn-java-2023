package JavaFundamentals;

public class Main {
    int instanceVar1; // Instance variable declared
    String instanceVar2; // Instance variable declared

    static int staticVar; // Static variable declared

    public void setStaticVar(int value) {
        staticVar = value; // Setting the value of staticVar
    }

    public void displayStaticVar() {
        System.out.println("Static Variable: " + staticVar);
    }


    public void displayInstanceVars() {
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);
    }

    public void calculateSum() {
        int a = 5; // Local variable 'a' declared and initialized
        int b = 10; // Local variable 'b' declared and initialized
        int sum = a + b; // Local variable 'sum' declared and assigned a value
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        JavaFundamentals jFundamentals = new JavaFundamentals();
        jFundamentals.basicSyntax();
        jFundamentals.dataTypesVariables();

        System.out.println();

        System.out.println("Local Variables:");
        Main example = new Main();
        example.calculateSum(); // Calling the method to calculate and print sum

        System.out.println();

        System.out.println("Instance Variables:");
        Main obj1 = new Main();
        obj1.instanceVar1 = 15; // Assigning a value to instanceVar1 of obj1
        obj1.instanceVar2 = "Hello"; // Assigning a value to instanceVar2 of obj1
        obj1.displayInstanceVars(); // Calling the method to display instance variables

        System.out.println();

        Main obj2 = new Main();
        obj2.instanceVar1 = 20; // Assigning a value to instanceVar1 of obj2
        obj2.instanceVar2 = "World"; // Assigning a value to instanceVar2 of obj2
        obj2.displayInstanceVars(); // Calling the method to display instance variables for obj2

        System.out.println();

        System.out.println("Static Variables:");
        Main sobj1 = new Main();
        sobj1.setStaticVar(5); // Setting staticVar using obj1
        obj1.displayStaticVar(); // Displaying staticVar using obj1

        Main sobj2 = new Main();
        sobj2.setStaticVar(10);
        sobj2.displayStaticVar(); // Displaying staticVar using obj2 (value will be the same)



    }
}
