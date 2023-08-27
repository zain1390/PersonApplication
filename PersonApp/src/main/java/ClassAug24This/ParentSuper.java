package ClassAug24This;

public class ParentSuper {
    private String name = "Bob";

    public ParentSuper() {
    }

    public ParentSuper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Super Class");
    }

    public static void main(String[] args) {
        ChildClass ob = new ChildClass("Hello");
    }
}
