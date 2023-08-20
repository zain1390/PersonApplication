package Aug17;

public class Order {
    private Integer orderID;
    private Product product;

    public Order(Integer orderID, Product product) {
        this.orderID = orderID;
        this.product = product;
    }

    public double getTotalPrice() {
        return product.getPrice();
    }

    @Override
    public String toString() {
        return "->Order=" + orderID  + " Product:" + product.getName() + " Total Price:$" + getTotalPrice();
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