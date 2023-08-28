package JavaFundamentals.Datastructures.ArrayProblems;

public class ProbelemTwo {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        printArray(arr, 6);
        reverseArray(arr, 0, 5);
        System.out.println("Reversed Array: ");
        printArray(arr, 6);
        System.out.println("\n");
        printRecursiveArray(arr, 6);
        System.out.println("Reversed Recursive Array: ");
        recursiveArray(arr, 0, 5);
        printRecursiveArray(arr, 6);

        System.out.println("\n");
        int arrLength = arr.length;
        int display = 2;
        printRotateArray(arr, arrLength);
        System.out.println("Rotated Array: ");
        rotateArray(arr, display, arrLength);
        printRotateArray(arr, arrLength);
        System.out.println();
        System.out.println("Rotate Array One");
        rotateArrayOne(arr, display, arrLength);


    }

    public static void rotateArrayOne(int arr[], int display, int length) {
        int place = 1;
        while (place <= display) {
            int last = arr[0];
            for (int i = 0; i < length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[length - 1] = last;
            place++;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateArray(int arr[], int d, int n) {
        // storing array
        int[] temp = new int[n];
        int k = 0;

        // store the current array and n - d
        for (int i = d; i < n; i++) {
            temp[k] = arr[i];
            k++;
        }

        // store the pop element
        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }

        // copy and print the rotated array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void printRotateArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int arr[], int start, int end) {
        int temp;
         while(start < end) {
             temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
         }
    }
    public static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void recursiveArray(int arr[], int start, int end) {
        int temp;

        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        recursiveArray(arr, start+1, end-1);
    }
    public static void printRecursiveArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
