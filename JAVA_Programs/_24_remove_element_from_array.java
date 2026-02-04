import java.util.Scanner;

public class _24_remove_element_from_array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] userArray = _18_arrayInput.arrayelements();
        _18_arrayInput.showArray(userArray);

        System.out.println("\nEnter the number which you want to delete.");
        int delNum = input.nextInt();

        int[] newArr = deletenum(userArray, delNum);

        System.out.println("Your new array is:");
        _18_arrayInput.showArray(newArr);

        input.close();

    }

    public static int[] deletenum(int[] array, int numToDelete) {

        int totalOccurance = _20_no_of_occerance_in_array.cheakOccurance(array, numToDelete);

        if (totalOccurance == 0) {
            return array;
        }

        int newSize = array.length - totalOccurance;

        int[] newArr = new int[newSize];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != numToDelete) {
                newArr[j] = array[i];
                j++;
            }

        }
        return newArr;
    }

}
