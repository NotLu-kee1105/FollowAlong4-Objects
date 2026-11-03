package part16;

// Create a class called Human
public class Human {

    // Instance variable to store the human's name
    String name;

    // Instance variable to store the human's age
    int age;

    // Instance variable to store the human's weight
    double weight;

    // Constructor for the Human class
    // Runs automatically whenever a new Human object is created
    Human(String firstName, int age, double weight) {

        // Assign the parameter firstName to this object's name variable
        this.name = firstName;

        // Assign the parameter age to this object's age variable
        this.age = age;

        // Assign the parameter weight to this object's weight variable
        this.weight = weight;
    }

    // Method that makes a Human eat
    void eat() {

        // Print the name of the human followed by "is eating"
        System.out.println(this.name + " is eating");
    }

    // Method that makes a Human drink
    void drink() {

        // Print the name of the human followed by "is drinking *burp*"
        System.out.println(this.name + " is drinking *burp*");
    }

} // End of Human class