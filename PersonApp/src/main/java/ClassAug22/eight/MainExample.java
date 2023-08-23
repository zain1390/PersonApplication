package ClassAug22.eight;

import java.util.ArrayList;

public class MainExample {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal();
        Animal a4 = new Animal();
        Animal a5 = new Animal();

        Bear b1 = new Bear("Bear Baby");
        Dog d1 = new Dog("Puppy");

        list.add(a1);
        list.add(b1);
        list.add(d1);
        for (Animal a : list) {
            a.printName();
        }
    }
}
