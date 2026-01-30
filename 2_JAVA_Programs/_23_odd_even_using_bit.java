import java.util.Scanner;

public class _23_odd_even_using_bit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number ");
        int number = input.nextInt();

        String result = oddEven(number);
        System.out.printf("%d is %s.", number, result);

        input.close();
    }

    public static String oddEven(int num) {
        if ((num & 1) == 0) {
            return "Even";
        }
        return "Odd";

    }

}
