package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12340s
//        starts at about 3:25:40 — stop at about 3:32:05, before "the toString method"
// Guide: GUIDE.md in this folder, steps 1–7
//
// Part 17, topic 1 — overloaded constructors
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called OverloadedConstructors.
//    Leave the "package part17;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Pizza. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Pizza.java too.

// Create a public class called OverloadedConstructors
public class OverloadedConstructors {

    // Main method - program starts running here
    public static void main(String[] args) {

        // Create a Pizza object using a constructor
        // Passing four arguments:
        // bread = "thick crust"
        // sauce = "tomato"
        // cheese = "mozzarella"
        // topping = "pepperoni"
        Pizza pizza = new Pizza(
                "thick crust",
                "tomato",
                "mozzarella",
                "pepperoni"
        );

        // Print a title before listing the ingredients
        System.out.println("Here are the ingredients of your pizza: ");

        // Print the bread stored in the pizza object
        System.out.println(pizza.bread);

        // Print the sauce stored in the pizza object
        System.out.println(pizza.sauce);

        // Print the cheese stored in the pizza object
        System.out.println(pizza.cheese);

        // Print the topping stored in the pizza object
        System.out.println(pizza.topping);

    } // End of main method

} // End of class
