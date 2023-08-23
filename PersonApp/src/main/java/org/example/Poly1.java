package org.example;

public class Poly1 {

    public void show(int a) {
        System.out.println("int method is called");
    }

    public void show(String a) {
        System.out.println("String method is called");
    }

    public static void main(String[] args) {
        Poly1 ob = new Poly1();
        ob.show('z');
    }
}

//    public void show(int a,float b) {
//        System.out.println("int method is called");
//    }
//    public void show(float a) {
//        System.out.println("float method is called");
//    }
//    public void show(char a) {
//        System.out.println("char method is called");
//    }
//
//    public static void main(String[] args) {
//        Poly1 ob = new Poly1();
//        ob.show(3,53F);
//        ob.show(4.5F);
//        ob.show('a');

