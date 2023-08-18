package Aug17;

public class Order extends Product {
    int orderId;
    String product;

    public Order() {
    }

    public Order(int orderId, String product) {
        this.orderId = orderId;
        this.product = product;
    }

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public Order(String product) {
        this.product = product;
    }

    public double getTotalPrice() {
        System.out.println(product.getPrice());
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", product='" + product + '\'' +
                '}';
    }
}


/*
class Order:
fields:
orderId,
product (of type Product)
constructor(orderId, product)
getTotalPrice() // returns product.getPrice()
toString() // returns formatted order details

class Product:
fields: name, price
constructor(name, price)
getName()
getPrice()

main:
Create Product laptop with name "Laptop" and price 1000.0
Create Product smartphone with name "Smartphone" and price 500.0
Create Order order1 with orderId 1 and product as laptop Create Order order2 with orderId 2 and product as smartphone
Print order1 using toString() method Print order2 using toString() method
 */