package Aug21.Program1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0, 1);
        numbers.add(10);
        numbers.add(15);
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println("->4.End of the ACCESS AND PRINT ELEMENTS() \n");
        System.out.println(numbers.size());
        System.out.println("->5.End of the SIZE() \n");
        numbers.remove(1);
        if (numbers.contains(10)) System.out.println("Numbers[] Contains 10");
        else System.out.println("Numbers[] doesnt contains 10");
        System.out.println("->6.End of the REMOVE() \n");
        numbers.add(10);
        boolean contains = numbers.contains(10);
        if (contains) System.out.println("Number is added in variable 'contains' \nand now Numbers[] contain 10");
        else System.out.println("Numbers[] doesnt contain 10");
        System.out.println("->7.End of the CONTAINS() \n");
        numbers.clear();
        if (numbers.isEmpty())
            System.out.println(numbers + " Numbers[] list is empty");
        else System.out.println(numbers + " are in Array list");
        System.out.println("->8.End of the Clear() \n");
    }
}

/*
1. Import the required package:
- Import the `java.util` package to gain access to the `ArrayList` class.
Now in the main method 2. Create an `ArrayList`:
- Declare an `ArrayList` of integers named `numbers`.
3. Add elements to the `ArrayList`:
- Use the `add()` method to add integers (5, 10, and 15) to the `numbers` ArrayList.
4. Access and print elements:
- Print the element at index 0 using `numbers.get(0)`. - Print the element at index 1 using `numbers.get(1)`. - Print the element at index 2 using `numbers.get(2)`.
5. Get the size of the `ArrayList`:
- Use the `size()` method to get the size of the `numbers` ArrayList and store it in a variable
named `size`.
6. Remove an element:
- Use the `remove()` method to remove the element at index 1 from the `numbers` ArrayList.
7. Check if an element exists:
- Use the `contains()` method to check if the `numbers` ArrayList contains the element 10 and
store the result in a variable named `contains`.
8. Clear all elements:
- Use the `clear()` method to remove all elements from the `numbers` ArrayList.
*/


