import java.util.Scanner;

public class product_of_float {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your first decimal number: ");
        float num1=input.nextFloat();

        System.out.print("Enter your second decimal number: ");
        float num2=input.nextFloat();

        float result=num1*num2;
        System.out.println("Answer : " + result);

        input.close();
    }
}
