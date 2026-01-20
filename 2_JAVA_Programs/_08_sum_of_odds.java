import java.util.Scanner;

public class _08_sum_of_odds {

    public static void Odds_Sum(int last) {
        int i = 0;
        int sum = 0;

        while (i <= last) {
            if (i % 2 == 1) {
                System.out.print(i + "\t");
                sum += i;
            }
            i++;
        }
        System.out.println("\nSum of all these ODD numbers is : " + sum);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter last number of range : ");
        int lastNumber = input.nextInt();

        Odds_Sum(lastNumber);

        input.close();

    }

}
