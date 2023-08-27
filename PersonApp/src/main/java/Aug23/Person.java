/*1. Define the "Person" class:
- Create a class named "Person".
- Add private attributes "name" and "age".
- Create a constructor to initialize "name" and "age".
- Define getter methods for "name" and "age".
- Implement a method "displayInfo()" to print name and age.*/
package Aug23;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println("Person name: "
                + name + ", Person Age: " + age);
    }
}
