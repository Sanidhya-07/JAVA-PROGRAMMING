import java.util.Scanner;

public class _15_fibonacci_series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the count of fibonacci elements: ");
        int count = input.nextInt();
        fibo_series(count);

        input.close();
    }

    public static void fibo_series(int count) {

        int first = 0;
        int second = 1;
        int third;

        int i = 0;
        while (i < count) {

            System.out.print(first + " ");

            third = first + second;
            first = second;
            second = third;

            i++;

        }

    }

}
