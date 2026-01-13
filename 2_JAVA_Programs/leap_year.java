import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Year (ex-2004) : ");
        int Year = input.nextInt();

        if ((Year % 4 == 0 && Year % 100 != 0) || Year % 400 == 0) {
            System.out.println(Year + " is a leap year.");
        } else {
            System.out.println(Year + " is a not leap year.");

        }
        input.close();

    }

}
