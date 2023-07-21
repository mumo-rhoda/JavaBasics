import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class JavaHashMap {
    /*
    A HashMap however, store items in "key/value" pairs,
    and you can access them by an index of another type (e.g. a String).

     Use the keySet() method if you only want the keys, and use the values() method if you only want the values:

     An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping.

To use an Iterator, you must import it from the java.util package.
     */
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));
        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i +"keys");
        }
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);// In the example above, even though BMW is added twice it only appears once in the set because every item in a set has to be unique.
        System.out.println(cars.contains("Mazda"));
        System.out.println(cars.size());
        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
