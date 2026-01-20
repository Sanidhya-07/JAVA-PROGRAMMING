import java.util.Scanner;

public class _02_positive_negative_zero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int num = input.nextInt();

        if (num == 0) {
            System.out.println("Number is Zero.");
        } else if (num > 0) {
            System.out.println("Number is Positive.");
        } else if (num < 0) {
            System.out.println("Number is Negative.");
        } else {
            System.out.println("Enter valid number");
        }

        input.close();
    }

}
