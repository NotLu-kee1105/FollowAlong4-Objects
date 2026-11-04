package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12741s
//        starts at about 3:32:20 — stop at about 3:38:30, at "that's how the toString method works"
// Guide: GUIDE.md in this folder, steps 8–12
//
// Part 17, topic 2 — the toString method
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ToStringMethod.
//    Leave the "package part17;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Car. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Car.java too.

// Create a class called ToStringMethod
public class ToStringMethod {

    // Main method - the program starts here
    public static void main(String[] args) {

        // Create a new Car object using the Car class
        Car car = new Car();

        // Print the make field of the car
        System.out.println(car.make);

        // Print the model field of the car
        System.out.println(car.model);

        // Print the color field of the car
        System.out.println(car.color);

        // Print the year field of the car
        System.out.println(car.year);

        // Call the toString() method explicitly
        // This returns a String containing all of the car's information
        System.out.println(car.toString());

        // Print the entire car object
        // Java automatically calls car.toString() behind the scenes
        System.out.println(car);

    } // End of main method

} // End of class
