package part16;

public class Human {
    String name;
    int age;
    double weight;

    Human(String firstName, int age, double weight) {
        this.name = firstName;
        this.age = age;
        this.weight = weight;
    }
    void eat() {
        System.out.println(this.name + " is eating");
    }

    void drink() {
        System.out.println(this.name + " is drinking *burp*");
    }
}
