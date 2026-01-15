import java.util.Scanner;

public class arraySearching {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] marks = { 58, 49, 36, 78, 10, 25, 17, 96, 50 };

        System.out.println("Enter the value which is to be searched : ");
        int value = input.nextInt();

        boolean isfound = searching(marks,value);

        if (isfound) {
            System.out.println(value + " is present in array.");
        } else {
            System.out.println(value + " is not present in array.");
        }

        input.close();

    }

    public static boolean searching(int[] marks, int value) {

        int i = 0;
        while (i < marks.length) {
            if (marks[i] == value) {
                return true;
            }
            i++;
        }
        return false;

    }

}
