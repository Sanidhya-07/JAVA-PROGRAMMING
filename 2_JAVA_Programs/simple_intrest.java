import java.util.Scanner;

public class simple_intrest {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principle amount:");
        float Principle=input.nextFloat();

        System.out.println("Enter the  Rate Of intrest:");
        float ROI=input.nextFloat();

        System.out.println("Enter the Time Period :");
        float TimePeriod=input.nextFloat();

        float SI = ( Principle * ROI * TimePeriod ) / 100; 

        System.out.println("Simple intrest is : " + SI);

        input.close();
    }
    
}
