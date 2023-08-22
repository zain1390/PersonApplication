package Aug21.Program2;

public class CompositionExample {
    public static void main(String[] args) {
        Address houseAddress = new Address("123 Main St", "Cityville\n");
        House house = new House(3, houseAddress);
        house.displayInfo();

        Address apartmentAddress = new Address("456 Elm Street", " Apartment City\n");
        Apartment apartment = new Apartment(4, apartmentAddress);
        apartment.displayinfo();
    }
}
/*
4. Create a `CompositionExample` class: - Inside the `main` function:
- Create an `Address` object `houseAddress` with "123 Main St" and "Cityville".
- Create a `House` object `house` with 3 bedrooms and `houseAddress`.
- Call `house.displayInfo()` to display house information.

- Create an `Address` object `apartmentAddress` with "456 Elm St" and "Apartment City".
- Create an `Apartment` object `apartment` with 2 rooms and `apartmentAddress`.
- Call `apartment.displayInfo()` to display apartment information.
 */