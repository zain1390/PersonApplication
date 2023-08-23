package org.example;

import org.example.ArrayClass;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(200);
        ll.add(110);

        for (Integer ele: ll) {
            System.out.println(ele);
        }


    }
}

       /*
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(10);
        ob.add(20);
        System.out.println(ob);
        */
/*
        ArrayClass ob = new ArrayClass();

//
//        For Program 2
//        Car ob = new Car("ford","2020");
//        ob.displayInfo();
// For Program 1        Person ob = new Person("Zain",31);
//
*/