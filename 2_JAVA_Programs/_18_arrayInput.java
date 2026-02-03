import java.util.Scanner;

public class _18_arrayInput {

    // for 1D array
    public static int[] arrayelements() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter total no of elements : ");
        int size = input.nextInt();

        int[] userArray = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Enter " + (i + 1) + " element of array : ");
            userArray[i] = input.nextInt();
            i++;
        }
        return userArray;

    }

    // for 2D array
    public static int[][] array2dElements() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter total no of rows : ");
        int rows = input.nextInt();

        System.out.println("Enter total no of columns : ");
        int columns = input.nextInt();

        int[][] userArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Enter your [%d][%d] element : ", i, j);
                userArray[i][j] = input.nextInt();

            }

        }

        return userArray;

    }

    // to print 1d array
    public static void showArray(int[] array) {
        for (int i : array) {
            System.out.printf("  %d\t", i);
        }
    }

}
