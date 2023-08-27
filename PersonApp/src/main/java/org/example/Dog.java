package org.example;

public class Dog extends Animal {

    public Dog() {
        super();
    }

    public Dog(String name, String habitat) {
        super(name, habitat);
    }

    public void bark() {
        System.out.println("Barking");
    }
}
