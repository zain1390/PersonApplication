package Aug17;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1,"Laptop");
        Order order2 = new Order(2,"Smartphone");

        Product laptop = new Product("Laptop",1000.0);
        Product smartphone = new Product("Smartphone",500.0);





        order1.getTotalPrice();
        order2.getTotalPrice();


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