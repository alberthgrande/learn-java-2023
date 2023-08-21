package JavaFundamentals.Loops;

public class Loops {
    public void forLoop() {
        System.out.println("for loop");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public void nestedForLoop() {
        System.out.println("nested for loop");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 1) {
                    System.out.println(i + " * " + j + " = " + i * j);
                    break;
                }
            } // end j
        } // end i
        System.out.println();
    }
    public void whileLoop() {
        System.out.println("while loop");
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }
        System.out.println();
    }
    public void doWhileLoop() {
        System.out.println("do while loop");
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i <= 3);
        System.out.println();
    }

    public void pyramid() {
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            } // end j
            System.out.println();
        } // end i
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            } // end j
            System.out.println();
        } // end i
    }

    public void forEachLoop() {
        System.out.println("for each loop");
        int arr[] = {10,20,30,40,50};

        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
    }
}
