package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13800s
//        starts at about 3:50:00 — stop at about 3:57:15, at "that's the basics of the static keyword"
// Guide: GUIDE.md in this folder, steps 1–9
//
// Part 19 — the static keyword
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called StaticKeyword.
//    Leave the "package part19;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Friend. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Friend.java too.

// Create a class named StaticKeyword
public class StaticKeyword {

    // Main method - program starts here
    public static void main(String[] args) {

        // Print the current number of Friend objects created
        // numberOfFriends is static, so it belongs to the Friend class
        System.out.println(Friend.numberOfFriends);

        // Create the first Friend object
        Friend friend1 = new Friend("SpongeBob");

        // Print the updated number of friends
        System.out.println(Friend.numberOfFriends);

        // Create the second Friend object
        Friend friend2 = new Friend("Patrick");

        // Print the updated number of friends
        System.out.println(Friend.numberOfFriends);

        // Create the third Friend object
        Friend friend3 = new Friend("Squidward");

        // Call a static method using the class name
        Friend.displayFriends();

        // Create the fourth Friend object
        Friend friend4 = new Friend("Sandy");

        // Display the updated friend count again
        Friend.displayFriends();

        // Call Java's built-in static round() method
        // Rounds 3.14 to the nearest whole number
        System.out.println(Math.round(3.14));

    } // End of main method

} // End of class