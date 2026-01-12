import java.util.Scanner;

public class addNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first Number : ");
        int num1=input.nextInt();
        System.out.println("Enter your second Number : ");
        int num2=input.nextInt();

        System.out.print("Addition is : " + (num1+num2));

        input.close();
    }
    
}
