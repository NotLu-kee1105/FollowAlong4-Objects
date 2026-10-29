// This class is inside the package named part15
package part15;

// Create a class called Car
// A class is a blueprint used to create Car objects
public class Car {

    // STATE (fields/attributes)

    // The make (manufacturer) of the car
    String make = "Chevrolet";

    // The model of the car
    String model = "Corvette";

    // The year the car was made
    int year = 2020;

    // The color of the car
    String color = "blue";

    // The price of the car
    double price = 50000.00;
    // This method simulates driving the car
    void drive() {

        // Print a message when the car is driven
        System.out.println("You drive the car");

    }



    // This method simulates braking the car
    void brake() {

        // Print a message when the brakes are used
        System.out.println("You step on the brakes");

    }

} // End of Car class


