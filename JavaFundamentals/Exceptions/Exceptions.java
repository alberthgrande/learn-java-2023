package JavaFundamentals.Exceptions;

public class Exceptions {
    public void intException() {
        System.out.println("int Exceptions: ");
        int a = 5, b = 0;
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    public void stringException() {
        System.out.println("string Exception: ");
        int a = 5, b = 0;
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
        System.out.println();
    }

    public void getMessageException() {
        System.out.println("getMessage Exception: ");
        int a = 5, b = 0;
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }

    public void sampleException() {
        System.out.println("sample Exception: ");
        String str = null;
        System.out.println(str.length());
        System.out.println();
    }


    // Java Program to Demonstrate Exception is Thrown
    // How the runTime System Searches Call-Stack
    // to Find Appropriate Exception Handler

    // Method 1
    // It throws the Exception(ArithmeticException).
    // Appropriate Exception handler is not found
    // within this method.
    static int dividedByZero(int a, int e) {
        System.out.println("dividedByZero Exception: ");

        // this statement will cause ArithmeticException
        // (/by zero)
        int i = a / e;
        System.out.println();
        return i;
    }

    // The runTime System searches the appropriate
    // Exception handler in method also but couldn't have
    // found. So looking forward on the call stack
    static int computeDivision(int a, int e) {
        int res = 0;

        // Try block to check for exceptions
        try {
            res = dividedByZero(a, e);
        }

        // Catch block to handle NumberFormatException
        // exception Doesn't matches with
        // ArithmeticException
        catch (NumberFormatException ex) {
            // Display message when exception occurs
            System.out.println("NumberFormatException is occurred");
        }

        return res;
    }

    // Method 2
    // Found appropriate Exception handler.
    // i.e. matching catch block.
    public void outputException() {
        int i = 1;
        int e = 0;

        // Try block to check for exceptions
        try {
            int o = computeDivision(i, e);
        }

        // Catch block to handle ArithmeticException
        // exceptions
        catch (ArithmeticException ex) {
            // getMessage() will print description
            // of exception(here / by zero)
            System.out.println(ex.getMessage());
        }
    }

    public void needTryCatchClause() {
        // Taking an array of size 4
        int[] arr = new int[4];

        // Now this statement will cause an exception
        int i = arr[4];

        // This statement will never execute
        // as above we caught with an exception
        System.out.println("Hi, I want to execute");
    }

}
