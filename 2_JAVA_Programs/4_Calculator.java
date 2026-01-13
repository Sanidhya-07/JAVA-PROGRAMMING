import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our Calculator:\n\n");

        System.out.println("Enter your first number: ");
        int num1=input.nextInt();

        System.out.println("Enter your second number: ");
        int num2=input.nextInt();

        System.out.println("Addition is : " + (num1+num2));
        System.out.println("Substraction is : " + (num1-num2));
        System.out.println("Multiplication is : " + (num1*num2));
        System.out.println("Division is : " + (num1/num2));
        System.out.println("Modulus is : " + (num1%num2));

        input.close();
    }
    
}
