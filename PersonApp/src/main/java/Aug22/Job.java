/*Class Job:
Declare String title Declare double salary
Method Job(String title, double salary): Assign title to this.title
Assign salary to this.salary
Method displayJobInfo(): Print "Title: " + title
Print "Salary: $" + salary*/

package Aug22;

public class Job {
    private String title;
    private double salary;

    public Job(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }
    public void displayJobInfo() {
        System.out.println("Title: " + title);
        System.out.println("Salary: $"+ salary);
    }

}
