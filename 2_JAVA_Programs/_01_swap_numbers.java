import java.util.Scanner;

class _01_swap_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 = input.nextInt();

        System.out.println("Enter second number : ");
        int num2 = input.nextInt();

        System.out.println("Before Swapping :");
        System.out.println("first number : " + num1);
        System.out.println("second number : " + num2);

        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\n\nAfter Swapping :");
        System.out.println("first number : " + num1);
        System.out.println("second number : " + num2);

        input.close();

    }
}
