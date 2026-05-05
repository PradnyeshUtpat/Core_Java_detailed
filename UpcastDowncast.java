// File: OOPConceptsDemo.java

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class UpcastDowncast {

    public static void main(String[] args) {

        // ============================================================
        // 1. UPCASTING
        // ============================================================

        /*
         * Upcasting = Child object → Parent reference
         *
         * Syntax:
         * Parent ref = new Child();
         *
         * It is:
         * - Automatic
         * - Safe
         */

        Animal a1 = new Dog(); // UPCASTING

        /*
         * Here:
         * - Reference type = Animal
         * - Object type = Dog
         *
         * Think:
         * "I have a Dog object, but I am treating it as an Animal"
         */


        // ============================================================
        // WHAT METHODS CAN WE CALL?
        // ============================================================

        /*
         * IMPORTANT RULE:
         * What you can CALL depends on the REFERENCE TYPE (Animal)
         */

        a1.sound(); // ✅ Allowed (present in Animal)
        a1.eat();   // ✅ Allowed (present in Animal)

        // a1.fetch(); ❌ NOT allowed → Compile-time error
        // Because fetch() is not present in Animal


        // ============================================================
        // 2. DYNAMIC METHOD DISPATCH
        // ============================================================

        /*
         * EVEN THOUGH reference is Animal,
         * Java will call the method based on OBJECT type at runtime.
         *
         * So:
         */
        a1.sound(); // Output → Dog barks

        /*
         * WHY?
         *
         * Compile time:
         * - Checks if Animal has sound() → YES → OK
         *
         * Runtime:
         * - Object is Dog → Dog overrides sound()
         * - So Dog's version is executed
         *
         * 👉 This is called Dynamic Method Dispatch
         */


        // ============================================================
        // MORE EXAMPLES
        // ============================================================

        Animal a2 = new Cat(); // Upcasting again

        a2.sound(); // Output → Cat meows (runtime decides)


        // ============================================================
        // 3. DOWNCASTING
        // ============================================================

        /*
         * Downcasting = Parent reference → Child reference
         *
         * Syntax:
         * Child ref = (Child) parentRef;
         *
         * It is:
         * - Manual
         * - Risky
         */

        Animal a3 = new Dog(); // Upcasting first

        Dog d1 = (Dog) a3; // DOWNCASTING

        /*
         * Now we can access Dog-specific methods
         */
        d1.fetch(); // ✅ Allowed


        // ============================================================
        // DANGER OF DOWNCASTING
        // ============================================================

        Animal a4 = new Animal();

        // Dog d2 = (Dog) a4; ❌ Runtime Error (ClassCastException)

        /*
         * WHY?
         *
         * Because:
         * - Object is actually Animal
         * - NOT a Dog
         *
         * So Java throws ClassCastException at runtime
         */


        // ============================================================
        // SAFE DOWNCASTING (BEST PRACTICE)
        // ============================================================

        Animal a5 = new Dog();

        if (a5 instanceof Dog) {
            Dog d3 = (Dog) a5;
            d3.fetch(); // Safe to call
        }

        /*
         * instanceof checks:
         * "Is this object actually a Dog?"
         */


        // ============================================================
        // FINAL SUMMARY (VERY IMPORTANT)
        // ============================================================

        /*
         * 1. Upcasting:
         *    Dog → Animal
         *    Safe and automatic
         *
         * 2. What you can CALL:
         *    Depends on reference type (Animal)
         *
         * 3. What actually RUNS:
         *    Depends on object type (Dog)
         *
         * 4. Dynamic Method Dispatch:
         *    Method decided at runtime based on object
         *
         * 5. Downcasting:
         *    Animal → Dog
         *    Risky, use instanceof
         */
    }
}