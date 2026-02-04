public class _21_max_min_in_array {
    public static void main(String[] args) {
        int[] numArray = _18_arrayInput.arrayelements();

        System.out.print("\nYour array is :");
        int i = 0;
        while (i < numArray.length) {
            System.out.print(numArray[i] + "\t");
            i++;
        }

        int max = maximum(numArray);
        int min = minimum(numArray);
        System.out.println("\nMaximum element in array is : " + max);
        System.out.println("\nMinimum element in array is : " + min);

    }

    public static int maximum(int[] array) {
        int max = array[0];
        int i = 0;
        while (i < array.length) {
            if (array[i] > max) {
                max = array[i];
            }
            i++;
        }
        return max;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        int i = 0;
        while (i < array.length) {
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        }
        return min;
    }

}
