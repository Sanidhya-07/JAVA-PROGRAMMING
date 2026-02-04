public class _25_reverse_array {

    public static void main(String[] args) {
        int[] userArray = _18_arrayInput.arrayelements();

        System.out.println("Your array is : ");
        _18_arrayInput.showArray(userArray);

        userArray = reverseArray(userArray);

        System.out.println("\nreverse of array is : ");
        _18_arrayInput.showArray(userArray);

    }

    public static int[] reverseArray(int[] array) {

        int j = array.length - 1;

        for (int i = 0; i < (array.length / 2); i++) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            j--;

        }
        return array;
    }

}
