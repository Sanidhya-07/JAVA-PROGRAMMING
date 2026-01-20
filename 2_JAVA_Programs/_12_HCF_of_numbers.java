import java.util.Scanner;

public class _12_HCF_of_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println("Your numbers are : " + num1 + "," + num2 + "," + num3);

        int result = HCF(num1, num2, num3);

        System.out.println("HCF of given numbers is : " + result);

        input.close();

    }

    public static int leastnumber(int first, int second, int third) {

        int least;

        if (first < second) {
            if (first < third) {
                least = first;
            } else {
                least = third;
            }
        } else {
            if (second < third) {
                least = second;
            } else {
                least = third;
            }
        }
        return least;
    }

    public static int HCF(int num1, int num2, int num3) {

        int leastNum = leastnumber(num1, num2, num3);

        int HCF = 1;

        int i = 1;
        while (i <= leastNum) {

            if ((num1 % i == 0) && (num2 % i == 0) && (num3 % i == 0)) {
                HCF = i;
            }
            i++;
        }

        return HCF;

    }
}
