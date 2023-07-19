public class JavaEncapsulation {
    //Encapsulation is to make sure that sensitive data is hidden from users.
    //Declare variables/attributes as private
    //provide public get and set methods to access and update the value of a private variable.
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;// this keyword is used to refer to the current object.
    }
    public static void main(String[] args){
        JavaEncapsulation person = new JavaEncapsulation();
        person.setName("Rhoda");
        System.out.println(person.getName());
    }
}
//importance of Encapsulation
/*
Better control of lass attributes and methods
Class attributes can be read-only or write only
Flexible change one part of the code without affecting other parts
Increased security of data
 */
