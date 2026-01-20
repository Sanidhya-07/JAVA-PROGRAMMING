import java.util.Scanner;

public class _07_multiplication_table {

    public static void table(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = input.nextInt();
        table(number);

        input.close();
    }

}
