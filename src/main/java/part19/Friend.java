package part19;

// Create a class called Friend
public class Friend {

    // Instance variable
    // Each Friend object gets its own name
    String name;

    // Static variable
    // Shared by ALL Friend objects
    static int numberOfFriends;

    static String newestFriend;
    // Constructor
    // Runs whenever a new Friend object is created
    Friend(String name) {

        // Set this friend's name
        this.name = name;

        // Increase the shared friend counter by 1
        numberOfFriends++;

        newestFriend = name;
    }

    // Static method
    // Belongs to the Friend class, not individual Friend objects
    static void displayFriends() {

        // Print the total number of friends created
        System.out.println("You have " + numberOfFriends + " friends");
    }


} // End of Friend class
