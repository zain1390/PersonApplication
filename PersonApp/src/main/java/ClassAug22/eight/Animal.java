package ClassAug22.eight;

public class Animal {
    private String name;

    public Animal(){
        this.name = "Cat";
    }

    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("Name is "+ this.name);
    }
}
