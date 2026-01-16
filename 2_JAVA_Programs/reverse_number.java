import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number = input.nextInt();

        int reverse = reverse(number);
        System.out.println("Reverse of number is : " + reverse);

        input.close();

    }

    public static int reverse(int number) {

        int revNum = 0;

        while (number > 0) {
            int unitPlace = number % 10;
            revNum = (revNum * 10) + unitPlace;
            number /= 10;

        }
        return revNum;
    }
}