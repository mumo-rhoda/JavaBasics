public class ForEachLoop {

    // for each loop is used exclusively to loop through elements in an array.
    /*
Lopping through the array elements with for loop and use the length property to specify how many times the loop should run.
     */


    public static void main(String[] args) { {
        String [] cars = {"Volvo", "Ford","Mazda","Toyoata","Benz"};
//        for (String i : cars){
//            System.out.println(i);
//        }
        for (int i = 0; i < cars.length; i++){

            System.out.println(cars[i]);

        }
        int [][] myNumbers = {{1,2,3,4}, {344,4,4}};
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1].length); //Outputs 9 instead of 4

       //prints contents of a multidimentional array,
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }


    }

}}
