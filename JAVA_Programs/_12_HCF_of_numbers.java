import java.util.Scanner;

public class _12_HCF_of_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1 = input.nextInt();

        System.out.println("Enter your second number:");
        int num2 = input.nextInt();

        int gcd = gcdOfNumbers(num1, num2);
        System.out.printf("GCD of %d and %d is %d.", num1, num2, gcd);
        input.close();

    }

    public static int gcdOfNumbers(int num1, int num2) {

        while (num2 != 0) {
            int temp = num2;

            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

}