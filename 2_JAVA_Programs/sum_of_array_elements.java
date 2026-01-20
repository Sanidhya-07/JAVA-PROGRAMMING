import java.util.Scanner;

public class sum_of_array_elements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of array : \n");
        int size = input.nextInt();

        int[] numbers = new int[size];

        int i = 0;
        float sum = 0;
        while (i < size) {
            System.out.print("Enter array's " + (i + 1) + " element : ");
            numbers[i] = input.nextInt();
            sum+=numbers[i];
            i++;
        }

        System.out.println("Addition of all elements in array is : " + sum);
        System.out.println("Average of all elements in array is : " + (sum/size));

        input.close();
    }


}
