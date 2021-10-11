package sef.module3.activity;

/**
 * @author
 */
public class OperatorActivity {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Declare numbers to be operated
        int i = 8;
        int j = 5;

        // Subtract numbers
        int result = i - j;

        // Print result
        System.out.println("Difference = " + result);

        // Add numbers
        int addition = i + j;

        // Print result
        System.out.println("Addition = " + addition);

        //Multiplication

        int multiply = i * j;

        System.out.println("Multiplication = " + multiply);

        //Division
        double division = (double) i / (double) j;
        System.out.println("Division = " + division);

        //Modulo
        int modulo = j % i;
        System.out.println("Modulo = " + modulo);


    }

}
