/*
Class MainClass:
Method main(String[] args):
Instantiate Job object softwareEngineer with title "Software Engineer"
and salary 80000 Instantiate Person object person with
name "Alice", age 30, and job softwareEngineer Call person.displayInfo()
 */

package Aug22;

public class Main {
    public static void main(String[] args) {
        Job softwareEngineer = new Job("Software Engineer", 80000);
        Person person = new Person("Alice",30,softwareEngineer);
        person.displayInfo();
    }
}
