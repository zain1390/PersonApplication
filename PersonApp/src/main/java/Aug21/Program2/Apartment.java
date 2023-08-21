package Aug21.Program2;
public class Apartment {
    private int rooms;
    private Address address;
    public Apartment(int rooms, Address address) {
        this.rooms = rooms; this.address = address;}
    public void displayinfo() {
        System.out.println("Apartment with '" + rooms + "' rooms");
        System.out.println("Located at: " + address.getStreet() + "," + address.getCity());
    }
}


/*
3. Create an `Apartment` class:
- Declare private variables `rooms` and `address` (of type `Address`) to store the number of
rooms and the address of the apartment.
- Create a constructor `Apartment(rooms, address)` to initialize the `rooms` and `address`
variables.
- Create a method `displayInfo()`:
- Print "Apartment with [rooms] rooms".
- Print "Located at: [address.getStreet()], [address.getCity()]".
 */