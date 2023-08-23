package ClassAug22.eight;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void printName() {
        System.out.println("Dog Class Name");
        super.getName();

    }
}
