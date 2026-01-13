import java.util.Scanner;

public class age_classification {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter your Age : ");
        int age = input.nextInt();

        if (age>0 && age<13){
            System.out.println("You are CHILD.");
        }
        else if(age >=13 && age < 20){
            System.out.println("You are TEEN.");
        }
        else if(age >=20 && age < 60){
            System.out.println("You are ADULT.");
        }
        else if(age >=60){
            System.out.println("You are SENIOR CITIZEN.");
        }
        else{
            System.out.println("Enter valid value of Age.");
        }
        input.close();
    }
}
