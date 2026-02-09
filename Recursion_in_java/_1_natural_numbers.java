import java.util.Scanner;

public class _1_natural_numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your last number :");
        int last = input.nextInt();

        System.out.println("Natural numbers are");
        naturalNumbers(last);

    }

    public static void naturalNumbers(int num) {
        if (num < 1) {
            return;
        }

        naturalNumbers(num - 1);
        System.out.printf("%d\t", num);
    }

    // public static void naturalNumbers(int num) {
    // if (num < 1) {
    // return;
    // }

    // System.out.printf("%d\t", num);
    // naturalNumbers(num - 1);
    // }

}
