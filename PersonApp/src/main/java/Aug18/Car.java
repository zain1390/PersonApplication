package Aug18;
public class Car extends Vehicle {
    private int numDoors;
    public Car(String type, int year, int numDoors) {
        super(type, year);
        this.numDoors = numDoors;}
    public int getNumDoors() {
        return numDoors;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors:" + numDoors);}}
