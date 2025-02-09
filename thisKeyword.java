// thisKeyword.java
class Mobile_This {
    String brand;
    int price;

    // Constructor 1: Using this to avoid variable shadowing
    Mobile_This(String brand) {
        this.brand = brand;  // "this.brand" refers to instance variable
    }

    // Constructor 2: Constructor chaining with this()
    Mobile_This() {
        this("Default Brand", 1000);  // Calls constructor with two parameters
    }

    // Constructor with brand and price
    private Mobile_This(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    // Method to demonstrate use of this for calling instance methods
    void call() {
        System.out.println("Making a call...");
    }

    void start() {
        this.call();  // Explicitly calling another method using this
        System.out.println("Call started");
    }

    // Returning the current object
    Mobile_This getMobile_This() {
        return this;
    }

    void display() {
        System.out.println(brand + " costs " + price);
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        // Demonstrate constructor with this keyword
        Mobile_This m1 = new Mobile_This("Samsung");
        m1.display();  // Output: Samsung costs 1000

        // Demonstrate constructor chaining with this()
        Mobile_This m2 = new Mobile_This();
        m2.display();  // Output: Default Brand costs 1000

        // Demonstrate calling instance methods using this
        m2.start();  // Output: Making a call... Call started

        // Demonstrate returning the current object using this
        m2.getMobile_This().display();  // Output: Default Brand costs 1000
    }
}
