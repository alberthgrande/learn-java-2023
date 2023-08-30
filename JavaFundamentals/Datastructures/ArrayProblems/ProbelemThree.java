package JavaFundamentals.Datastructures.ArrayProblems;

public class ProbelemThree {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int length = arr.length;
        int position = 2;

        rightRotate(arr,length,position);
    }

    public static void rightRotate(int arr[],int length, int position) {
        position = position%length;
        for (int i = 0; i < length; i++) {
            if (i < position) {
                System.out.print(arr[length + i - position] + " ");
            }
            else {
                System.out.print(arr[i - position] + " ");
            }
        }
    }
}
