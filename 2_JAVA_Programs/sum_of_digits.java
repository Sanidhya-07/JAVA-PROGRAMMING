import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number = input.nextInt();

        int sum = sumOfDigit(number);
        System.out.println("Sum of all digit in " + number + " is " + sum);
        input.close();

    }

    public static int sumOfDigit(int number) {
        int sum = 0;

        while (number > 0) {

            int unitPlace = number % 10;
            sum = sum + unitPlace;

            number = number / 10;

        }
        return sum;
    }

}
