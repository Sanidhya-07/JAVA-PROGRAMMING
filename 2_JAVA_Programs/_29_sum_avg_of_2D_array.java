public class _29_sum_avg_of_2D_array {

    public static void main(String[] args) {
        int[][] userArray = _18_arrayInput.array2dElements();

        int sum = addition(userArray);
        System.out.printf("Addition of all elements in 2D array is :%d\n", sum);

        float avg = average(userArray);
        System.out.printf("Average of all elements in 2D array is :%.3f", avg);
    }

    public static int addition(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }

        }
        return sum;
    }

    public static float average(int[][] array) {
        float sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }

        }
        return (float) (sum / count);
    }
}
