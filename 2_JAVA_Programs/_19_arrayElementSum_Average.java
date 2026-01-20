public class _19_arrayElementSum_Average {
    public static void main(String[] args) {
        int[] numArray = _18_arrayInput.arrayelements();

        System.out.print("\nYour array is :");
        int i = 0;
        while (i < numArray.length) {
            System.out.print(numArray[i] + "\t");
            i++;
        }
        double addition = sum(numArray);
        float avg = average(numArray);
        System.out.print("\n\nAddition of all array elements is : " + addition);
        System.out.print("\nAverage of all array elements is : " + avg);

    }

    public static double sum(int[] array) {
        double sum = 0;
        int i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }
        return sum;
    }

    public static float average(int[] array) {
        float sum = (float) sum(array);
        return sum / array.length;
    }

}
