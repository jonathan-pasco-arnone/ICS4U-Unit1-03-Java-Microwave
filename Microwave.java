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
    */
    // The amount of seconds it takes for each menu item to reheat.
    public static final float subTime = 60;
    public static final float pizzaTime = 45;
    public static final float soupTime = 95;
    public static final float secondsInMinute = 60;

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
        final String food;
        final float quantity;
        float quantityMultiplier;
        float Minutes = 0;
	float Seconds = 0;
	// Create scanner objects for inputs.
        final Scanner myObjOne = new Scanner(System.in);
        final Scanner myObjTwo = new Scanner(System.in);
        // Ask for inputs
        System.out.println(" ");

        /*
        * This accepts an inputted and tests it.
        */
        try {
            // Ask for inputs
            System.out.println("Are you heating a sub, pizza, or soup?: ");
            food = myObjOne.nextLine();
            System.out.println("How many " + food + "(s) are you heating?(max:3): ");
            quantity = myObjTwo.nextFloat();

            // Calculations
            quantityMultiplier = Math.floor((quantity + 1) * 0.5);
            if (food == "sub") {
                Minutes = subTime * quantityMultiplier / secondsInMinute;
                Seconds = (subTime * quantityMultiplier / secondsInMinute - Minutes) * 60;
            }
            System.out.println("It will take " + Minutes
                + " minutes and " + Seconds + " seconds to heat.");
        } catch (java.util.InputMismatchException ex) {
            System.out.println("That was not a valid input");
        } finally {
            System.out.println("\nDone.");
        }
    }
}
