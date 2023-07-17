public class Constructors {
    //constructor is a special method that is used to initialize
    // objects. called when an object of a class is created.
    //Constructor name must match the class name and no return type (like void)
int X;//class attribute
    //create a class constructor for the Constructors class
    public Constructors(){
        X=5;//setting initial value

    }
    public static void main(String[]args){
        Constructors myObj = new Constructors(); // Creating an object of class will call the constructor.
        System.out.println(myObj.X); //print value
    }

}
