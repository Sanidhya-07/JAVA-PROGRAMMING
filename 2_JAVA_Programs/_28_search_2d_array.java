import java.util.Scanner;

public class _28_search_2d_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = _18_arrayInput.array2dElements();

        System.out.println("Enter the element to be searched.");
        int num = input.nextInt();

        boolean res = isPresent(array, num);
        if (res) {
            System.out.printf("%d is present in 2D array", num);
        } else {
            System.out.printf("%d is not present in 2D array", num);

        }
        input.close();
    }

    public static boolean isPresent(int[][] array, int numTobeSearched) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] == numTobeSearched) {
                    return true;
                }

            }
        }

        return false;
    }
}
