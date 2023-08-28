package JavaFundamentals.Datastructures.ArrayProblems;

public class ApproachThree {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int length = arr.length;
        int display = 10;

        // method approach
        approachThree(arr, display, length);

        // print rotate
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void approachThree(int[] arr, int display, int length) {
        for (int i = 0; i < gdc(display, length); i++) {
            // store to temp
            int temp = arr[i];
            int j = i;
            while (true) {
                int k = (j + display) % length;
                if (k == i) {
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    public static int gdc(int display, int length) {
        if (length == 0) {
            return display;
        }
        return gdc(length, display % length);
    }
}
