import java.util.Scanner;

public class _09_factorial_of_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int num = input.nextInt();

        int result = factorial(num);
        System.out.println("Factorial of " + num + " is : " + result);

        input.close();
    }

    public static int factorial(int num) {
        int i = 1;
        int fact = 1;

        if (num == 1 || num == 0) {
            return 1;
        } else {

            while (i <= num) {
                fact = fact * i;
                i++;
            }
        }

        return fact;
    }

}
