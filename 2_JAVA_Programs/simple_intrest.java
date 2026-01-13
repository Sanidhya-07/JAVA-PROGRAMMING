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
        double CI = Principle * Math.pow(( 1 + ROI/100),TimePeriod ); 

        System.out.println("Simple intrest is : " + SI);
        System.out.println("Compound intrest is : " + CI);

        input.close();
    }
    
}
