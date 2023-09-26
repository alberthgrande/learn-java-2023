package JavaFundamentals.JavaCollectionsFramework.ArrayProblems;

public class ProblemOne {

    public static void objectArrys() {
        // 1. Default values.
        //
        // 1.1 If the array elements are of object types then the default value is null.
        Integer[] arr = new Integer[5];
        for (Integer arrs : arr) {
            System.out.print(arrs + " ");
        }
    }
    public static void primitiveArrays() {
        int[] arr = new int[5];
//        for (int arrs = 0; arrs < 5; arrs++) {
//            arr[arrs] = arrs;
//            System.out.print(arr[arrs] + " ");
//        }
        for (int arrs : arr) {
            System.out.print(arrs + " ");
        }
    }

    public static void garbageArrays() {
        int[] arr = new int[5];

        for (int arrs : arr) {
            System.out.print(arrs   +" ");
        }

    }

    public static void main(String[] args) {
        objectArrys();
        System.out.println();
        primitiveArrays();
        System.out.println();
        garbageArrays();
    }
}
