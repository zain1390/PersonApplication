package ClassAug22.eight;

public class Bear extends Animal {

    public Bear(String name) {
        super(name);
    }

    @Override
    public void printName() {
        System.out.println("bear Class: "+super.getName());
    }
}
