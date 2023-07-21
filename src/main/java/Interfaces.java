public interface Interfaces {
/*
An interface is a completely "abstract class" that is used to group related methods with empty bodies:
Why And When To Use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below).
 */
public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}
class piig implements Interfaces {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}
class Main {
    public static void main(String[] args) {
      piig myPig = new piig();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
        DemoClass myinterfaces = new DemoClass();
        myinterfaces.myMethod();
        myinterfaces.myOtherMethod();
    }
}
interface FirstInterface {
    public void myMethod(); // interface method
}

interface SecondInterface {
    public void myOtherMethod(); // interface method
}
class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}