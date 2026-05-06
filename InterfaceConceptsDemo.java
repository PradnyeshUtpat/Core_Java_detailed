// File: InterfaceConceptsDemo.java

/*
 * ================================
 * INTERFACE CONCEPTS IN JAVA
 * ================================
 *
 * This file covers:
 * 1. Basic interface
 * 2. Implementation using class
 * 3. Upcasting + dynamic dispatch
 * 4. Default methods
 * 5. Static methods
 * 6. Multiple inheritance using interfaces
 *
 * Read this like notes + code together.
 */

interface Vehicle {

    /*
     * 1. ABSTRACT METHOD
     * -------------------
     * - By default: public + abstract
     * - No body
     * - MUST be implemented by class
     */
    void drive();

    /*
     * 2. DEFAULT METHOD
     * -------------------
     * - Has body
     * - Optional to override
     * - Called using object
     */
    default void playMusic() {
        System.out.println("Playing music from Vehicle");
    }

    /*
     * 3. STATIC METHOD
     * -------------------
     * - Belongs to interface
     * - NOT inherited
     * - Called using interface name
     */
    static void info() {
        System.out.println("This is Vehicle interface");
    }

    /*
     * 4. VARIABLES
     * -------------------
     * - Always: public static final
     * - Constant (cannot change)
     */
    int MAX_SPEED = 120;
}

/*
 * Another interface to demonstrate
 * multiple inheritance
 */
interface Electric {
    void charge();
}

/*
 * CLASS IMPLEMENTING INTERFACE
 */
class Tesla implements Vehicle, Electric {

    /*
     * MUST implement abstract methods
     */
    @Override
    public void drive() {
        System.out.println("Driving Tesla");
    }

    @Override
    public void charge() {
        System.out.println("Charging Tesla");
    }

    /*
     * OPTIONAL: override default method
     */
    @Override
    public void playMusic() {
        System.out.println("Tesla premium sound system");
    }
}

public class InterfaceConceptsDemo {

    public static void main(String[] args) {

        /*
         * ================================
         * 1. OBJECT CREATION (UPCASTING)
         * ================================
         */
        Vehicle v = new Tesla(); // Upcasting

        /*
         * - Reference type = Vehicle
         * - Object type = Tesla
         */

        /*
         * ================================
         * 2. METHOD CALLS
         * ================================
         */

        // Abstract method → Tesla implementation runs
        v.drive(); // Output: Driving Tesla

        // Default method → Tesla override runs
        v.playMusic(); // Output: Tesla premium sound system

        /*
         * IMPORTANT:
         * You can only call methods present in interface (Vehicle)
         * Even though object is Tesla
         */

        // v.charge(); ❌ ERROR (not in Vehicle)

        /*
         * ================================
         * 3. ACCESSING CONSTANT
         * ================================
         */
        System.out.println("Max speed: " + Vehicle.MAX_SPEED);

        /*
         * ================================
         * 4. STATIC METHOD CALL
         * ================================
         */
        Vehicle.info(); // Must use interface name

        // v.info(); ❌ NOT allowed

        /*
         * ================================
         * 5. MULTIPLE INTERFACES
         * ================================
         */
        Electric e = new Tesla();
        e.charge(); // Works

        /*
         * ================================
         * 6. DOWNCASTING (ADVANCED)
         * ================================
         */
        Tesla t = (Tesla) v; // Downcasting

        t.drive();
        t.playMusic();
        t.charge(); // Now accessible

        /*
         * ================================
         * FINAL SUMMARY
         * ================================
         *
         * - Interface = contract (what to do)
         * - Class = implementation (how to do)
         *
         * - Abstract method → must implement
         * - Default method → optional override
         * - Static method → call using interface
         *
         * - Upcasting → restricts access
         * - Object decides runtime behavior
         */
    }
}