/*
* This program calculates the amount of time to reheat a
* specific quantity of a specific type of food.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-11-22
*/

// Imports.
import java.util.Scanner;

/**
* This program calculates the amount of time to reheat a
* specific quantity of a specific type of food.
* (remember to change the name after "final class").
*/
final class Microwave {

    /**
    * Constants.
    * The amount of seconds it takes to heat a sub.
    */
    public static final float SUB_TIME = 60;
    /**
    * The amount of seconds it takes to heat pizza.
    */
    public static final float PIZZA_TIME = 45;
    /**
    * The amount of seconds it takes to heat soup.
    */
    public static final float SOUP_TIME = 95;
    /**
    * The amount of seconds in a minute.
    */
    public static final float SECONDS_IN_MINUTE = 60;
    /**
    * Constant created.
    */
    public static final float MAX_QUANTITY = 4;

    /**
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Microwave() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Variables
        String food;
        double quantity;
        float quantityMultiplier;
        float minutes = 0;
        float seconds = 0;
        // This is simply for the loop.
        float program = 1;
        final double getQuantityMultiplier = 0.5;
        // Create scanner objects for inputs.
        final Scanner myObjOne = new Scanner(System.in);
        final Scanner myObjTwo = new Scanner(System.in);
        // Ask for inputs
        System.out.println(" ");

        /*
        * This accepts an inputted and tests it.
        */
        try {
            do {
                // Ask for inputs
                System.out.println("Are you heating a sub, pizza, or soup?: ");
                food = myObjOne.nextLine();
                System.out.println("How many "
                    + food + "(s) are you heating?(max:3): ");
                quantity = myObjTwo.nextFloat();

                // Calculations
                quantityMultiplier = (float) ((quantity + 1)
                    * getQuantityMultiplier);
                if ("sub".equals(food) && quantity > 0 && quantity < MAX_QUANTITY) {
                    minutes = (float) Math.floor(SUB_TIME
                        * quantityMultiplier / SECONDS_IN_MINUTE);
                    seconds = (SUB_TIME * quantityMultiplier
                        / SECONDS_IN_MINUTE - minutes) * SECONDS_IN_MINUTE;
                } else if ("pizza".equals(food) && quantity > 0 && quantity < MAX_QUANTITY) {
                    minutes = (float) Math.floor(PIZZA_TIME
                        * quantityMultiplier / SECONDS_IN_MINUTE);
                    seconds = (PIZZA_TIME * quantityMultiplier
                        / SECONDS_IN_MINUTE - minutes) * SECONDS_IN_MINUTE;
                } else if ("soup".equals(food) && quantity > 0 && quantity < MAX_QUANTITY) {
                    minutes = (float) Math.floor(SOUP_TIME
                        * quantityMultiplier / SECONDS_IN_MINUTE);
                    seconds = (SOUP_TIME * quantityMultiplier
                        / SECONDS_IN_MINUTE - minutes) * SECONDS_IN_MINUTE;
                } else if (quantity > 0 && quantity < MAX_QUANTITY) {
                    System.out.println("Please enter one of the three foods.");
                    break;
                } else {
                  System.out.println("Pleas enter one of the"
                      + " three options for quantity.");
                  break;
                }
                System.out.println("It will take " + minutes
                    + " minutes and " + seconds + " seconds to heat.");
                program = 2;

            } while (program == 1);
        } catch (java.util.InputMismatchException ex) {
            System.out.println("That was not a valid input");
        } finally {
            System.out.println("\nDone.");
        }
    }
}
