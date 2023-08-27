/* Question1
Class OverloadedMethods:
Method int add(int a, int b):
Return a + b
Method int add(int a, int b, int c):
Return a + b + c
Method double add(double a, double b):
Return a + b
Class MainClass:
Method main(String[] args):
Declare OverloadedMethods class object named as calculator
Print "Sum of two integers: " + calculator.add(5, 10)
Print "Sum of three integers: " + calculator.add(5, 10, 15)
Print "Sum of two doubles: " + calculator.add(3.5, 2.7) */
package Aug22;

public class OverloadedMethods {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadedMethods calculator = new OverloadedMethods();
        System.out.println("Sum of '2' integers: " + calculator.add(5, 10));
        System.out.println("Sum of '3' integers: " + calculator.add(5, 10, 15));
        System.out.println("Sum of '2' doubles : " + calculator.add(3.5, 2.7));
    }
}
