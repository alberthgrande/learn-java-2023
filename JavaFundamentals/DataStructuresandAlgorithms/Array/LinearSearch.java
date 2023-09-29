package JavaFundamentals.DataStructuresandAlgorithms.Array;

public class LinearSearch {

    public static int search(int arr[], int arrLength, int key) {

        for (int i = 0; i < arrLength; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 50, 30, 70, 80, 20, 90, 40};
        int key = 30;
        int result = search(arr, arr.length, key);
        if (result == -1) {
            System.out.println("No match found!");
        }
        else {
            System.out.println("Key found in array index: " + result);
        }

    }
}
