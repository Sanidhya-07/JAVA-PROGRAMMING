package JAVA_Programs;

import java.util.Scanner;

public class _31_password_cheaker_DoWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to set passward.");
        String passward;

        do {
            System.out.print("Enter your passward : ");
            passward = input.next();

        } while (!isValid(passward));
        System.out.println("Passward is set successfully.");

        input.close();

    }

    public static boolean isValid(String passward) {
        return passward.length() > 6;

    }

}
