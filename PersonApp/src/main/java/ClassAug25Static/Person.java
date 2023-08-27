package ClassAug25Static;

public class Person {
    private String name = "Bob";
    private int age = 24;
    private static int salary = 20000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getSalary() {
        return salary;
    }

    public static void setSalary(int salary) {
        Person.salary = salary;
    }

    @Override
    public String toString() {
        return "Person " +
                "name= '" + name + '\'' +
                ", age=" + age + '\'' +
                " Salary= " + salary;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.setAge(30);
        p1.setName("Zain");

        p2.setAge(40);
        p2.setName("Second");

        p3.setAge(35);
        p3.setName("Third");
        p3.setSalary(0);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
