package JavaFundamentals.JavaCollectionsFramework.ArrayProblems;

public class MethodOne {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9, 11 };
        int length = arr.length;;
        int rotate = 3;
        rotate = rotate % length;
        int i,j,k;
        // reverse the last rotate number
        for (i = length - rotate, j = length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Reverse the first length-rotate terms
        for (i = 0, j = length - rotate - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Reverse the entire array
        for (i = 0, j = length - 1; i < j; i++, j-- ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // print the reverse array
        for (k = 0; k < length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
