import java.util.Scanner;

public class perimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter length of rectangle: ");
        float length=input.nextFloat();

        System.out.println("Enter breadth of rectangle: ");
        float breadth=input.nextFloat();

        float perimeter=2*(length+breadth);

        System.out.println("Perimeter of Rectangle is : " + perimeter);

        input.close();

    }
    
}
