import java.util.Scanner;

public class _06_celcius_to_fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in degree celcius:");
        float inDegree = input.nextFloat();

        float FinalAnswer = (inDegree * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit is : " + FinalAnswer);

        input.close();

    }

}
