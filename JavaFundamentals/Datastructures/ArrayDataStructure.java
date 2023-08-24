package JavaFundamentals.Datastructures;

public class ArrayDataStructure {
    public static void oneDimentionalArray() {
        System.out.println("1D array: ");
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
//        arr[6] = 6;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void twoDimentionalArray() {
        System.out.println("2D array: ");
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(arr[row][col] + ", ");
            }
            System.out.println();
        }

    }

    public static void threeDimentionalArray() {
        System.out.println("3D array: ");
        // Define dimensions of the 3D array
        int xSize = 3;
        int ySize = 4;
        int zSize = 5;

        // Create a 3D array with the specified dimensions
        int[][][] threeDArray = new int[xSize][ySize][zSize];

        // Initialize the elements of the 3D array
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                for (int z = 0; z < zSize; z++) {
                    threeDArray[x][y][z] = x + y + z;
                }
            }
        }

        // Print the elements of the 3D array
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                for (int z = 0; z < zSize; z++) {
                    System.out.println("threeDArray[" + x + "][" + y + "][" + z + "] = " + threeDArray[x][y][z]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try {
            oneDimentionalArray();
            System.out.println();
            twoDimentionalArray();
            System.out.println();
            threeDimentionalArray();
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An exception occurred: " + e.getMessage());
            System.out.println("Index is out of bounds.");
        }
    }
}
