public class AbstractClass {
//Process of hiding certain details and showing only essential information to the user.
    /*
    Abstract class - restricted class that cannot be used to create objects (it must be inherited)
    Abstract method- only used in an abstract class. no body.
    Body provided by subclass.

     */

        public static void main(String[] args) {
            Pig myPig = new Pig(); // Create a Pig object
            myPig.animalSound();
            myPig.sleep();
        }

}
abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}
