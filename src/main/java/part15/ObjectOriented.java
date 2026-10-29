package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10770s
//        starts at about 2:59:30 — stop at about 3:09:48, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 2 — the same lesson, written out step by step
//
// Part 15, video 2 — objects (object-oriented programming)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called ObjectOriented.
//    Leave the "package part15;" line and the "public class ObjectOriented" line alone.
//    He also makes a second class called Car. YOU make that file too:
//    right-click the part15 folder -> New -> Java Class -> type Car -> Enter.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    in THIS file AND in Car.java, saying in YOUR OWN WORDS what that line does.

// Create a public class named ObjectOriented
public class ObjectOriented {

    // Main method - Java starts running here
    public static void main(String[] args) {

        // Create the first Car object named myCar2
        // This object is built from the Car class blueprint
        Car myCar2 = new Car();

        // Create the second Car object named myCar1
        // This is a separate object with its own identity
        Car myCar1 = new Car();

        // Print the make of myCar1
        System.out.println(myCar1.make);

        // Print the model of myCar1
        System.out.println(myCar1.model);

        // Print an empty line to make the output easier to read
        System.out.println();

        // Print the make of myCar2
        System.out.println(myCar2.make);

        // Print the model of myCar2
        System.out.println(myCar2.model);

        // Print another empty line
        System.out.println();

        // Call the drive method on myCar2
        // This makes myCar2 perform its drive behavior
        myCar2.drive();

        // Call the brake method on myCar2
        // This makes myCar2 perform its brake behavior
        myCar2.brake();

    } // End of main method

} // End of class