public class _30_sum_of_diagonal_element {
    public static void main(String[] args) {

        int[][] userArray = _18_arrayInput.array2dElements();

        int sum = sumOfDiagonal(userArray);
        System.out.printf("Addition of diagonal element is : %d", sum);
    }

    public static int sumOfDiagonal(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }

            }

        }
        return sum;
    }

}
