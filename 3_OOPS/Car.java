public class Car {

    // Static with variables
    static int totalCars = 0 ;
 

    // Instance variables or Attributes  ( Associated with instances only )
    int noOfWheels;
    float currentFuelInLiter;
    float maxSpeed = 140.25f;
    String color = "Black";
    int noOfSeats;


    // Methods
    public void drive() {
        if (currentFuelInLiter == 0) {
            System.out.println("Car is out of fuel.please add fuel.");
        } else if (currentFuelInLiter < 5) {
            System.out.println("Car is in reserve mode.please refuel it .");
            currentFuelInLiter--;
        } else {
            System.out.println("car is moving");
        }
    }

    public void addFuel(float fuel) {
        currentFuelInLiter += fuel;
        System.out.println("Fuel is added.");
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }
}


