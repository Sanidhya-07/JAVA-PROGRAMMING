import java.util.Scanner;

public class LCM_of_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int result = LCM(num1, num2);
        System.out.println("LCM of given numbers is : " + result);

        input.close();
        
    }

    public static int LCM(int first, int second) {
        int lcm = 1;

        int i = 1;
        while (true) {

            if ((first * i) % second == 0) {
                lcm = first * i;
                return lcm;
            }
            i++;
            
        }

    }

}
