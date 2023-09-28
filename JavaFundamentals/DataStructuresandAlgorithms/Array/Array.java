package JavaFundamentals.DataStructuresandAlgorithms.Array;

public class Array {
    public static void main(String[] args) {
        // static array
        int array_one[] = {10,20,30,40,50};
        for (int i = 0; i < array_one.length; i++) {
            System.out.print(array_one[i] + " ");
        }
        System.out.println();
        // dynamic array
        int array_two[] = new int[5];
        for (int i = 0; i < array_two.length; i++) {
            System.out.print(array_two[i] + " ");
        }
    }
}
