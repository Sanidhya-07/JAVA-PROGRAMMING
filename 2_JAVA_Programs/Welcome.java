import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name=input.next();

        System.err.println("Welcome " + name + " to INDIA !");

        input.close();
    }
    
}
