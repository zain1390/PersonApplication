/*
Class Person:
Declare String name
Declare int age
Declare Job job - Object injection
Method Person(String name, int age, Job job): Assign name to this.name
Assign age to this.age Assign job to this.job
Method displayInfo():
Print "Name: " + name Print "Age: " + age
Call job.displayJobInfo()
*/

package Aug22;

public class Person {
    private String name;
    private int age;
    private Job job;

    public Person(String name, int age, Job job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void displayInfo() {
        System.out.println("Name: " + name +
                ", Age: " + age);
        job.displayJobInfo();
    }
}
