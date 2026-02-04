import java.util.Scanner;

public class _20_no_of_occerance_in_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArray = _18_arrayInput.arrayelements();

        System.out.println("Enter your no to cheak in array : ");
        int num = input.nextInt();

        int occurance = cheakOccurance(numArray, num);
        if (occurance == 0) {
            System.out.println(num + " is not present in array");
        } else {
            System.out.println(num + " is present in array and occured " + occurance + " times.");
        }
        input.close();
    }

    public static int cheakOccurance(int[] array, int number) {
        int counter = 0;

        int i = 0;
        while (i < array.length) {
            if (array[i] == number) {
                counter++;
            }
            i++;

        }
        return counter;
    }
}
