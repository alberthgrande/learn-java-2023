package JavaFundamentals.Datastructures.JavaArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayList {
    public static void main(String[] args) {

        // array list object
        ArrayList<String> cars = new ArrayList<String>();

        // array add()
        cars.add("BMW");
        cars.add("Mercedes-Benz");
        cars.add("Audi");

        // array access get()
        // System.out.println("Cars list: " + cars.get(0));
        // System.out.println("Cars list: " + cars.get(1));
        // System.out.println("Cars list: " + cars.get(2));

        // array change item set()
        cars.set(0,"BMW");


        // array remove item remove()
        // cars.remove(0);

        // Sort an ArrayList
        Collections.sort(cars);
        for (String car : cars) {
            System.out.println("Cars list: " + car);
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);
        Collections.sort(numbers);
        for (int number: numbers) {
            System.out.println("Sorted numbers: " + number);
        }
    }
}
