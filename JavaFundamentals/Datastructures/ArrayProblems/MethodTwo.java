package JavaFundamentals.Datastructures.ArrayProblems;

public class MethodTwo {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int len = arr.length;
        int rot = 2;

        // print output
        rotate(arr, len, rot);

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void rotate(int arr[], int len, int rot) {
        rot %= len;
        // Reverse the first part of the array
        reverse(arr, 0, len - rot - 1);

        // Reverse the second part of the array
        reverse(arr, len - rot, len - 1);

        // Reverse the entire array
        reverse(arr, 0, len - 1);

    }

    public static void reverse(int arr[], int len, int rot) {
        while(len < rot) {

            // Swap the element
            int temp =  arr[len];
                arr[len] = arr[rot];
                arr[rot] = temp;
                // Move next element
                len++;
                rot--;
        }
    }


}
