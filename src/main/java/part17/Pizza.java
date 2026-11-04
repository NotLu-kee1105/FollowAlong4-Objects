package part17;

// Create a class called Pizza
public class Pizza {

    // Instance variable to store the type of bread
    String bread;

    // Instance variable to store the sauce
    String sauce;

    // Instance variable to store the cheese
    String cheese;

    // Instance variable to store the topping
    String topping;

    // Constructor #1
    // Creates a pizza with bread, sauce, cheese, and topping
    Pizza(String bread, String sauce, String cheese, String topping) {

        // Assign the bread parameter to the object's bread field
        this.bread = bread;

        // Assign the sauce parameter to the object's sauce field
        this.sauce = sauce;

        // Assign the cheese parameter to the object's cheese field
        this.cheese = cheese;

        // Assign the topping parameter to the object's topping field
        this.topping = topping;
    }

    // Constructor #2
    // Creates a pizza with bread, sauce, and cheese only
    Pizza(String bread, String sauce, String cheese) {

        // Store bread in the object
        this.bread = bread;

        // Store sauce in the object
        this.sauce = sauce;

        // Store cheese in the object
        this.cheese = cheese;
    }

    // Constructor #3
    // Creates a pizza with only bread and sauce
    Pizza(String bread, String sauce) {

        // Store bread in the object
        this.bread = bread;

        // Store sauce in the object
        this.sauce = sauce;
    }

    // Constructor #4
    // Creates a pizza with only bread
    Pizza(String bread) {

        // Store bread in the object
        this.bread = bread;
    }

    // Constructor #5
    // Creates a completely empty pizza
    Pizza() {

    }

} // End of Pizza class