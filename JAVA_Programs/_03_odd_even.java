import java.util.Scanner;

public class _03_odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is EVEN");
        } else {
            System.out.println("Number is ODD");
        }

        input.close();

    }

}
