public class Driver {


    public static void main(String[] args) {
        // object creation 
        Car myCar = new Car();
        
        myCar.drive();
        myCar.addFuel(10);
        myCar.drive();
        System.out.println("Max speed is : " + myCar.getMaxSpeed());
        
    }
    
}
