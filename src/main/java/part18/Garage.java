package part18;

// Create a class called Garage
public class Garage {
    void leave(Car car) {
        System.out.println("The " + car.name + " left the garage");
    }

    // Method named park
    // Takes a Car object as a parameter
    void park(Car car) {

        // Print a message showing which car is parked
        // car.name refers to the name field of the Car object
        System.out.println("The " + car.name + " is parked in the garage");



    } // End of park method

} // End of Garage class