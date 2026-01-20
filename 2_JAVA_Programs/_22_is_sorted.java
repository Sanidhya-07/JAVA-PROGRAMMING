public class _22_is_sorted {
    public static void main(String[] args) {
        int[] numArray = _18_arrayInput.arrayelements();

        System.out.print("\nYour array is :");
        int i = 0;
        while (i < numArray.length) {
            System.out.print(numArray[i] + "\t");
            i++;
        }
        boolean isInc = isIncreasing(numArray);
        boolean isDec = isDecreasing(numArray);

        if (isDec || isInc) {
            System.out.println("\nArray is sorted.");
        } else {
            System.out.println("\nArray is not sorted.");

        }

    }

    public static boolean isIncreasing(int[] array) {
        int i = 1;
        while (i < array.length) {
            if (array[i] < array[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] array) {
        int i = 1;
        while (i < array.length) {
            if (array[i] > array[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

}
