import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListss {
    //It is a resizable array which can be found in the Java.util package

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.get(0);// use get() and refer to index access element
        cars.set(0, "Opel"); //to modify an element
        //cars.remove(0);// to remove an element
        //cars.clear(); //to clear all elements
        cars.size(); //to find size of arraylist
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i)+"for loop");
        }
        //System.out.println(cars);
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i +"for each");
        }
    }
}
