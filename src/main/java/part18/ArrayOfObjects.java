package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13121s
//        starts at about 3:38:40 — stop at about 3:44:15, at "that's the basics of arrays of objects"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 18, topic 1 — an array of objects
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayOfObjects.
//    Leave the "package part18;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Food. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Food.java too.

// Create a public class called ArrayOfObjects
public class ArrayOfObjects {

    // Main method - program starts here
    public static void main(String[] args) {

        // Create an array that can hold 3 Food objects
        Food[] refrigerator = new Food[3];

        // Create a Food object named food1 with the name "pizza"
        Food food1 = new Food("pizza");

        // Create a Food object named food2 with the name "hamburger"
        Food food2 = new Food("hamburger");

        // Create a Food object named food3 with the name "hot dog"
        Food food3 = new Food("hot dog");

        // Create a Garage object
        Garage garage = new Garage();

        // Create a Car object named car1
        // Pass "BMW" into the constructor
        Car car1 = new Car("BMW");

        // Create a second Car object named car2
        // Pass "Tesla" into the constructor
        Car car2 = new Car("Tesla");

        // Pass the car1 object to the garage's park method
        garage.park(car1);

        // Pass the car2 object to the garage's park method
        garage.park(car2);

        // Store food1 (pizza) into index 0 of the refrigerator array
        refrigerator[0] = food1;

        // Store food2 (hamburger) into index 1 of the refrigerator array
        refrigerator[1] = food2;

        // Store food3 (hot dog) into index 2 of the refrigerator array
        refrigerator[2] = food3;

        // Print the name of the Food object at index 0
        System.out.println(refrigerator[0].name);

        // Print the name of the Food object at index 1
        System.out.println(refrigerator[1].name);

        // Print the name of the Food object at index 2
        System.out.println(refrigerator[2].name);

    } // End of main method

} // End of class