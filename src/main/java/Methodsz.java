import javax.swing.*;

public class Methodsz {
    //Methods help in code reuse.
    //methods declared a class.
    //static means the method belongs to the Main clas and not an object of the Main class.
    //Parameters act as variables inside the method
    //void keyword indicates the method should not return a value

    // static can be accessed without creating an object of the class

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    static void checkAge(int y){
        if (y>18){
            System.out.println( y +"is permitted");
        }
        else {
            System.out.println(y+"not permitted punny ass");
        }
    }
public  static void main(String[] args){
        checkAge(23);
        checkAge(44);
        checkAge(11);
    int myNum1 = plusMethod(8, 5);
    double myNum2 = plusMethod(4.3, 6.26);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);

    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    Methodsz myObj = new Methodsz(); // Create an object of Methodsz
    myObj.myPublicMethod(); // Call the public method on the object
}

//Method overloading multiple methods can hve the same name wth different parameters.
static int plusMethod(int x, int y) {
    return x + y;
}

    static double plusMethod(double x, double y) {
        return x + y;
    }



}
