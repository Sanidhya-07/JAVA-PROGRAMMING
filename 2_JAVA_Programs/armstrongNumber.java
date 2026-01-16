import java.util.Scanner;

public class armstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = input.nextInt();

        boolean isArmstrong = isArmstrong(num);

        if (isArmstrong) {
            System.out.println("It is an ArmStrong number.");
        } else {
            System.out.println("It is not an ArmStrong number.");
        }

        input.close();

    }

    public static boolean isArmstrong(int num) {
        int totalDigits = count(num);
        int numCopy=num;
        int finalNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, totalDigits);
        }
        return finalNumber == numCopy;

    }

    public static int pow(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;

    }

    public static int count(int num) {

        int counter = 0;
        while (num > 0) {
            counter++;
            num /= 10;
        }
        return counter;
    }

}
