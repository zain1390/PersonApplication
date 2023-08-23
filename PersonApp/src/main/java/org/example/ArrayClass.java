package org.example;

import java.io.IOException;
import java.util.Arrays;

public class ArrayClass {
    private int a[] = new int[10];

    public void displayInfo() throws IOException {
        try {
            int i = 10;
            int j = 0;
            int k = i / j;
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println("Cannot be divide by zero");
        } catch (Exception a) {
            System.out.println("Cannot be divide by zero");
        }


    }
}
