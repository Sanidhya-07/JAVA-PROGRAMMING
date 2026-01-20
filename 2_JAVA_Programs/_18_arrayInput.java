import java.util.Scanner;

public class _18_arrayInput {

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

}
