package part16;

import java.util.Random;

// Import the Random class so we can generate random numbers
import java.util.Random;

// Create a class called DiceRoller
public class DiceRoller {

    // Declare a Random object reference
    Random random;

    // Declare an integer to store the dice roll
    int number;

    // Constructor for the DiceRoller class
    // This runs automatically when a DiceRoller object is created
    DiceRoller() {

        // Create a new Random object
        random = new Random();

        // Call the roll method immediately
        // so the die is rolled as soon as the object is made
        roll();
    }

    // Method that simulates rolling a six-sided die
    void roll() {

        // Generate a random number from 1 to 6
        // random.nextInt(6) gives 0-5
        // +1 changes it to 1-6
        number = random.nextInt(6) + 1;

        // Print the result of the roll
        System.out.println(number);
    }
}
