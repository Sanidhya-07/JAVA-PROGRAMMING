import java.util.Scanner;

public class grade_based_on_marks {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Percentage: ");
        int Percentage = input.nextInt();

        if (Percentage>90){
            System.out.println("Grade: A ");
        }
        else if(Percentage > 75 && Percentage<=90){
            System.out.println("Grade: B ");
        }
        else if(Percentage > 60 && Percentage<=75){
            System.out.println("Grade: C ");
        }
        else if(Percentage >= 30 && Percentage<=60){
            System.out.println("Grade: D ");
        }
        else if(Percentage < 30 && Percentage>=0){
            System.out.println("Grade: F ");
        }
        else{
            System.out.println("Enter Valid Choice.");
        }

        input.close();
    }
}
