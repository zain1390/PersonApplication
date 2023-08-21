package Aug21.Program2;
public class House {
    private int bedrooms;
    private Address address;

    public House(int bedrooms, Address address) {
        this.bedrooms = bedrooms; this.address = address;}
    public void displayInfo() {
        System.out.println("\nHouse with '" + bedrooms + "' bedrooms");
        System.out.println("Located at: " + address.getStreet()
                + "," + address.getCity());
    }}
/*
2. Create a `House` class:
- Declare private variables `bedrooms` and `address` (of type `Address`) to store the number of bedrooms and the address of the house.
- Create a constructor `House(bedrooms, address)` to initialize the `bedrooms` and `address` variables.
- Create a method `displayInfo()`:
- Print "House with [bedrooms] bedrooms".
- Print "Located at: [address.getStreet()], [address.getCity()]".
 */