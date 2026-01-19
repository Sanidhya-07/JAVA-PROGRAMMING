public class Driver {


    public static void main(String[] args) {
        // object creation 
        Car myCar = new Car();
        Car myCar2 = new Car();
        Car myCar3 = new Car();
        Car myCar4 = new Car();
        Car myCar5 = new Car();
        
        myCar.drive();
        myCar.addFuel(10);
        myCar.drive();
        System.out.println("Max speed is : " + myCar.getMaxSpeed());

        System.out.println("Total cars sold : " + Car.totalCars);
        
    }
    
}
