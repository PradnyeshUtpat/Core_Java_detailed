# Naming Conventions in Java

## 1. Package Names
Package names should be in lowercase, and it is recommended to use your organization's domain name in reverse order as the prefix.
*Example:* `com.example.myproject`

## 2. Class Names
Class names should start with an uppercase letter and follow CamelCase.
*Example:* `MyClass`, `PersonDetails`

## 3. Interface Names
Interface names should start with an uppercase letter and follow CamelCase.
*Example:* `Runnable`, `EventListener`

## 4. Method Names
Method names should start with a lowercase letter and follow CamelCase.
Use meaningful names that convey the purpose of the method.
*Example:* `calculateTotal`, `getName`

## 5. Variable Names
Variable names should start with a lowercase letter and follow CamelCase.
Use meaningful names that describe the variable's purpose.
*Example:* `firstName`, `totalAmount`

## 6. Constant Names
Constant names should be in uppercase letters with underscores separating words.
*Example:* `MAX_VALUE`, `PI`

## 7. Enum Names
Enum types should follow the same naming conventions as classes.
Enum constants should be in uppercase letters with underscores.
*Example:* `DayOfWeek.MONDAY`, `Color.RED`

## 8. Parameter Names
Parameter names should start with a lowercase letter and follow CamelCase.
Use meaningful names that indicate the parameter's purpose.
*Example:* `calculateArea(int radius)`, `printDetails(String message)`

## 9. Local Variable Names
Local variable names should start with a lowercase letter and follow CamelCase.
Use meaningful names that describe the variable's purpose within a specific scope.
*Example:* `int count = 0;`

## 10. Boolean Variable Names
Boolean variable names should be in the form of a question and start with is, has, can, etc.
*Example:* `isEnabled`, `hasPermission`

## 11. Acronyms and Abbreviations
Treat acronyms and abbreviations as words in names, maintaining CamelCase.
*Example:* `XMLParser`, `HTTPService`

## 12. Class Member Prefixes
Use prefixes like `m` for member variables (e.g., `mTotalAmount`) to distinguish them from local variables.
Some developers prefer using `this.` instead.

## 13. Indentation and Spacing
Use consistent indentation (usually 4 spaces or a tab) and spacing.
Enhance readability with blank lines to separate logical sections of code.


```java
package com.example.myproject;

public class NamingConventionsExample {
    // Constant
    public static final int MAX_VALUE = 100;

    // Enum
    public enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    // Class
    public class PersonDetails {
        // Class member variable
        private String fullName;

        // Constructor
        public PersonDetails(String fullName) {
            // Using 'this' to distinguish between instance variable and parameter
            this.fullName = fullName;
        }

        // Method
        public String getFirstName() {
            // Local variable
            String[] nameParts = fullName.split(" ");
            // Using 'this' is optional here
            return nameParts.length > 0 ? nameParts[0] : "";
        }

        // Boolean variable
        private boolean isActive = true;

        // Getter for boolean variable
        public boolean isActive() {
            return isActive;
        }
    }

    // Method with parameters
    public void printDetails(String message, int count) {
        System.out.println(message + ": " + count);
    }

    // Main method
    public static void main(String[] args) {
        // Local variable
        int quantity = 5;

        // Creating an instance of the class
        NamingConventionsExample example = new NamingConventionsExample();

        // Method invocation
        example.printDetails("Total Quantity", quantity);

        // Enum usage
        DayOfWeek today = DayOfWeek.MONDAY;
        System.out.println("Today is " + today);

        // Constant usage
        System.out.println("Max Value: " + MAX_VALUE);

        // Creating an instance of the inner class
        PersonDetails person = example.new PersonDetails("John Doe");

        // Accessing class member variables and invoking methods
        System.out.println("Full Name: " + person.getFirstName());
        System.out.println("Is Active? " + person.isActive());
    }
}
