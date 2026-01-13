import java.util.Scanner;

public class Area_of_triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter base of triangle : ");
        float base=input.nextFloat();

        System.out.println("Enter height of triangle : ");
        float height=input.nextFloat();

        float Area=(float)(0.5*base*height);

        System.out.println("Area of triangle is : " + Area);

        input.close();
    }
    
}
