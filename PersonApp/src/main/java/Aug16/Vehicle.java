package Aug16;

public class Vehicle {
    private String type;


//    public Vehicle() {
//        this.type = "Sedan";
//    }

    public Vehicle(String type) {
        this.type = "sedan";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void start(){
        System.out.println("The "+type+ " vehicle is starting");
    }
}
