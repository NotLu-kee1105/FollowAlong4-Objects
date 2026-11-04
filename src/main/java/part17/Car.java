package part17;

// Create a class called Car
public class Car {

    // Instance variable storing the car's make
    String make = "Ford";

    // Instance variable storing the car's model
    String model = "Mustang";

    // Instance variable storing the car's color
    String color = "red";

    // Instance variable storing the car's year
    int year = 2021;

    // Override Java's built-in toString() method
    // This controls what gets printed when the object is printed
    public String toString() {

        // Return a String containing all car information
        // \n starts a new line
        return make + "\n" +
                model + "\n" +
                color + "\n" +
                year;
    }

} // End of Car class