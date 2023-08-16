package Aug16;

public class Vehicle {
    private String type;


    public Vehicle() {
    }

    public Vehicle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("The " + type + " is starting.");
    }
}
