import java.util.Scanner;
//java util is a package while scanner is a class of the java.util package
//create an object of the class and use any available methods found in the scanner
public class PackagesAPI {
    /*
    Package groups related classes.

     */
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String username = myObj.nextLine();
        System.out.println("Username is" +username);
    }
}
