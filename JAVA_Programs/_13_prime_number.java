import java.util.Scanner;

public class _13_prime_number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int num = input.nextInt();

        String result = prime(num);

        System.out.println(result);

        input.close();

    }

    public static String prime(int num) {

        if (num <= 0) {
            return " Enter  valid number";
        } else if (num == 1) {

            return "1 is neither prime nor composite.";
        } else {
            int count = 0;
            int i = 2;
            while (i < num) {
                if (num % i == 0) {
                    count++;
                    break;
                }
                i++;
            }
            if (count == 0) {
                return num + " is a prime number.";
            } else {
                return num + " is not a prime number.";

            }

        }

    }

}
