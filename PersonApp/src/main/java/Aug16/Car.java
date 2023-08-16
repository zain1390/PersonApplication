package Aug16;

public class Car extends Vehicle {
    public Car() {
        super("Vehicle");
    }
    public void drive() {
        System.out.println("The car is being driven");
    }

    /*
    Commenting out this as i have used the default constructor for calling the vehicle class
    public Car(String type){
        super("Vehicle");
    }


    */
}
