package Aug18;
public class Vehicle {
    private String type;
    private int year;
    public Vehicle(String type, int year) {
        this.type = type;
        this.year = year;}
    public String getType() {
        return type;}
    public void setType(String type) {
        this.type = type;}
    public int getYear() {
        return year;}
    public void setYear(int year) {
        this.year = year;}
    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Year: " + year);
    }
}
