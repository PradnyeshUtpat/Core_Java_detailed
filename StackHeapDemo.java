class Person {
    int age;

    Person(int age) {
        this.age = age;
    }
}

public class StackHeapDemo {

    public static void main(String[] args) {

        // ---------------- STACK MEMORY ----------------
        // Primitive variables are stored directly in stack
        int x = 10;  // stored in stack
        int y = 20;  // stored in stack

        // ---------------- HEAP MEMORY ----------------
        // Object is created in heap, reference is stored in stack
        Person p1 = new Person(25);
        // Stack: p1 → reference
        // Heap: Person object { age = 25 }

        // ---------------- REFERENCE BEHAVIOR ----------------
        Person p2 = p1;  
        // Both p1 and p2 point to SAME object in heap

        p2.age = 30;

        // Changing p2 also changes p1 (same object)
        System.out.println("p1 age: " + p1.age); // 30
        System.out.println("p2 age: " + p2.age); // 30

        // ---------------- METHOD CALL (STACK FRAME) ----------------
        // A new stack frame will be created for this method call
        changeValue(x, p1);

        // x is primitive → passed by value → no change
        System.out.println("x after method: " + x); // 10

        // p1 is reference → object can be modified
        System.out.println("p1 age after method: " + p1.age); // 99

        // ---------------- GARBAGE COLLECTION ----------------
        p1 = null;
        p2 = null;

        // Now object in heap has no references
        // It becomes eligible for garbage collection (JVM will clean it later)

        // ---------------- RECURSION (STACK USAGE) ----------------
        System.out.println("Factorial: " + factorial(5));
    }

    static void changeValue(int a, Person p) {
        // New stack frame created

        a = 50;         // only local copy changes (stack)
        p.age = 99;     // modifies object in heap

        // When method ends → this stack frame is removed
    }

    static int factorial(int n) {
        // Each recursive call creates a new stack frame

        if (n == 1) return 1;

        return n * factorial(n - 1);

        // If recursion is too deep → StackOverflowError
    }
}