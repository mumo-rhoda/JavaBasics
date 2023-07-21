public class EnumsJava {
    /*
    special class that represents a group of constants(unchangeable variables like final variables)
    constants must be in uppercase

    Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.

     */
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {
        //Level myVar = Level.MEDIUM;
        //System.out.println(myVar);
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }
    }
}
