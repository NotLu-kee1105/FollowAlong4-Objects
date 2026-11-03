package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
//        starts at about 3:10:07 — stop at about 3:19:32, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 16, video 1 — constructors
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called Constructors.
//    Leave the "package part16;" line and the "public class Constructors" line alone.
//    He also has a second class called Human. YOU make that file too:
//    right-click the part16 folder -> New -> Java Class -> type Human -> Enter.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    in THIS file AND in Human.java, saying in YOUR OWN WORDS what that line does.

// Create a public class named Constructors
public class Constructors {

    // Main method - Java starts running the program here
    public static void main(String[] args) {

        // Create a Human object named human1
        // Calls the Human constructor with:
        // name = "Rick"
        // age = 65
        // weight = 70
        Human human1 = new Human("Rick", 65, 70);

        // Create another Human object named human2
        // Calls the Human constructor with:
        // name = "Morty"
        // age = 16
        // weight = 50
        Human human2 = new Human("Morty", 16, 50);

        // Print the name stored in human1
        System.out.println(human1.name);

        // Print the name stored in human2
        System.out.println(human2.name);

        // Call the eat method on human1
        human1.eat();

        // Call the drink method on human2
        human2.drink();

    } // End of main method

} // End of class



