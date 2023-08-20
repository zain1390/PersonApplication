package Aug17;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

/*
class Product:
fields: name, price
constructor(name, price)
getName()
getPrice()

class Order:
fields:
orderId,
product (of type Product)
constructor(orderId, product)
getTotalPrice() // returns product.getPrice()
toString() // returns formatted order details

main:
Create Product laptop with name "Laptop" and price 1000.0
Create Product smartphone with name "Smartphone" and price 500.0
Create Order order1 with orderId 1 and product as laptop Create Order order2 with orderId 2 and product as smartphone
Print order1 using toString() method Print order2 using toString() method
 */