 class Inheritance {
    /*
    Inheritance concept - subclass and superclass
    Used keyword extends

     */
    protected String brand = "Ford";        // Vehicle attribute The code is accessible in the same package and subclasses.

    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}
    class Car extends Inheritance {
        private String modelName = "Mustang";    // Car attribute

        public static void main(String[] args) {

            // Create a myCar object
            Car myCar = new Car();

            // Call the honk() method (from the Vehicle class) on the myCar object
            myCar.honk();

            // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
            System.out.println(myCar.brand + " " + myCar.modelName);
        }

    }
