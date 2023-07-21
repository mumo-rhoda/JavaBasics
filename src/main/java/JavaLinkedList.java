import java.util.LinkedList;

public class JavaLinkedList {
    //Almost identical to Arraylist
    //contain many objects of the same type
    /*
   The LinkedList stores its items in "containers."
   The list has a link to the first container and each container has a link to the next container in the list.
   To add an element to the list,
   the element is placed into a new container and that container is linked to one of the other containers in the list.

Use an ArrayList for storing and accessing
data, and LinkedList to manipulate data.
     */

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
