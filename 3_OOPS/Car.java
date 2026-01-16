public class Car{

    // Instance variables or Attributes
    int noOfWheels;
    float currentFuelInLiter;
    float maxSpeed;
    String color;
    int noOfSeats;

    // Methods
    public void drive(){
        System.out.println("car is moving");
        currentFuelInLiter --;
    }
    public void addFuel(float fuel){
        currentFuelInLiter+=fuel;
    }

    public float getMaxSpeed(){
        return maxSpeed;
    }

    public String getColor(){
        return color;
    }
}