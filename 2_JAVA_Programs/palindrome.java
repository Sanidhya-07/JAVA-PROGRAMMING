import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number = input.nextInt();

        boolean Palindrome = cheakPalindrome(number);

        if (Palindrome) {
            System.out.println(number + " is Palindrome ");
        } else {
            System.out.println(number + " not a Palindrome ");
        }

        input.close();

    }

    public static boolean cheakPalindrome(int number) {

        int revNum = 0;
        int numberCopy = number;

        while (number > 0) {
            int unitPlace = number % 10;
            revNum = (revNum * 10) + unitPlace;
            number /= 10;

        }
        return revNum == numberCopy;
    }
}
