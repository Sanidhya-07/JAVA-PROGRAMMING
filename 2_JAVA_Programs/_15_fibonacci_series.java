import java.util.Scanner;

public class _15_fibonacci_series{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number of fibonacchi element:");
        int limit = input.nextInt();

        fibonacchi(limit);

        input.close();

    }

    public static void fibonacchi(int num) {

        int firstNum = 0;
        int secondNum = 1;
        int nextNum = 0;

        for (int i = 1; i <= num; i++) {
            System.out.printf("%d\t", firstNum);
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;

        }

    }
}