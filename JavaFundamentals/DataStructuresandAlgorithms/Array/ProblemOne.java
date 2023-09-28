package JavaFundamentals.DataStructuresandAlgorithms.Array;

public class ProblemOne {

    // print the three largest number in array
    public static void printTheThreeLargestNumber(int threeLargestNumber[], int arrayLength) {
        int first, second, third;

        // there should be three elements
        if (arrayLength < 3) {
            System.out.println(" Invalid Input ");
            return;
        }

        first = second = third = Integer.MIN_VALUE;
        for (int i = 0; i < arrayLength; i++) {
            // if the current element is larger first element
            if (threeLargestNumber[i] > first) {
                third = second;
                second = first;
                first = threeLargestNumber[i];
            }
            // if the array is in between the first and second update
            else if (threeLargestNumber[i] > second) {
                third = second;
                second = threeLargestNumber[i];
            }
            //
            else if (threeLargestNumber[i] > third) {
                third = threeLargestNumber[i];
            }
        }

        System.out.println("Print the three largest number: " + first + " " + second + " " + third);

    }
    public static void main(String[] args) {
        int findTheThreeLargestNumber[] = {50,10,40,30,20,100};
        int arrayLength = findTheThreeLargestNumber.length;
        printTheThreeLargestNumber(findTheThreeLargestNumber, arrayLength);
    }
}
