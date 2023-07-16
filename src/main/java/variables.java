public class variables {
    //application begins with class name and class name match the filename
    //class should start with an uppercase first letter
    //Final or constant variables - unchangeable read-only If you don't want others (or yourself) to overwrite existing values,
//Names should start with a lowercase letter and it cannot contain whitespace

    /*
1. primitive data type specifies the size and type of variable values, and it has no additional methods.
 eg:byte, short, int, long, float, double, boolean and char

2. Non-primitive data types are called reference types they refer to objects.
  can be null, starts with uppercase
  eg.  Strings, Arrays, Classes, Interface,

     */
    /*
Finding a Character in a String:
The indexOf() method returns the index (the position) of the
first occurrence of a specified text in a string (including whitespace):
https://www.w3schools.com/java/java_ref_string.asp

     */
    public static class Main {
        public static void main(String[] args) {
            System.out.println("Hello World");
            String name = "Mutindi mn";
            char[] ch = new char[10];
            System.out.println(name.hashCode());
            System.out.println(name.indexOf('i'));
            System.out.println(name.intern());

        }
    }
}
