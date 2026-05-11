package Generics;

/*
    ============================================================
                    JAVA GENERICS - BASICS
    ============================================================

    This single file covers:

    1. Why Generics Exist
    2. Problems Before Generics
    3. Type Safety
    4. Raw Types
    5. Generic Classes
    6. Multiple Type Parameters
    7. Diamond Operator <>
    8. Compile-time vs Runtime Errors
    9. Autoboxing
    10. Real-world connection with HashMap

   

    ============================================================
*/

import java.util.ArrayList;
import java.util.HashMap;


/*
    ============================================================
                    GENERIC CLASS (Single Type)
    ============================================================

    T = Type placeholder

    This class can store ANY datatype,
    but type will be decided while creating object.

    Example:
        Box<String>
        Box<Integer>
        Box<Double>

    Same class.
    Different datatype usages.
*/

class Box<T> {

    // T becomes actual datatype later
    private T value;

    // Method accepts T datatype
    void setValue(T value) {
        this.value = value;
    }

    // Method returns T datatype
    T getValue() {
        return value;
    }
}

/*
    ============================================================
                GENERIC CLASS (Multiple Types)
    ============================================================

    K = Key
    V = Value

    Similar to:
        HashMap<K, V>

    Example:
        Pair<Integer, String>

    means:
        Integer key
        String value
*/

class Pair<K, V> {

    private K key;
    private V value;

    void set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }
}

public class Generics {

    public static void main(String[] args) {

        /*
            ====================================================
                    PART 1 - BEFORE GENERICS
            ====================================================

            Before Java 5, generics did not exist.

            Collections stored Object type.
            That means ANYTHING could be added.

            Dangerous because:
            - No type safety
            - Runtime crashes possible
        */

        System.out.println("========== BEFORE GENERICS ==========");

        // RAW TYPE ArrayList
        ArrayList list = new ArrayList();

        // Different datatypes allowed
        list.add("Java");
        list.add(100);
        list.add(true);

        System.out.println(list);

        /*
            Problem:

            list.get(0) returns Object

            So manual casting needed.
        */

        String language = (String) list.get(0);

        System.out.println("Language: " + language);

        /*
            Dangerous part:

            Index 1 contains Integer (100)

            But we are forcing it into String.

            This compiles...
            BUT crashes at runtime.
        */

        try {

            String wrong = (String) list.get(1);

            System.out.println(wrong);

        } catch (ClassCastException e) {

            System.out.println("Runtime Error Occurred:");
            System.out.println(e);
        }

        /*
            ====================================================
                    PART 2 - GENERICS SOLUTION
            ====================================================

            Generics provide:
            - Type safety
            - Compile-time checking
            - No manual casting
        */

        System.out.println("\n========== GENERICS ==========");

        // This list ONLY accepts Strings
        ArrayList<String> names = new ArrayList<>();

        names.add("Pradnyesh");

        // Uncomment this line
        // names.add(100);

        /*
            Above line gives COMPILE-TIME ERROR.

            Much safer than runtime crash.
        */

        // No casting needed
        String name = names.get(0);

        System.out.println("Name: " + name);

        /*
            ====================================================
                    PART 3 - GENERIC CLASS
            ====================================================
        */

        System.out.println("\n========== GENERIC CLASS ==========");

        /*
            Here:
                T becomes String
        */

        Box<String> stringBox = new Box<>();

        stringBox.setValue("Hello Generics");

        String message = stringBox.getValue();

        System.out.println(message);

        /*
            Here:
                T becomes Integer

            NOTE:
            Generics work with OBJECTS only.

            int is primitive.
            Integer is wrapper class.

            Java automatically converts:
                int -> Integer

            This is called:
                AUTOboxing
        */

        Box<Integer> integerBox = new Box<>();

        integerBox.setValue(500);

        Integer number = integerBox.getValue();

        System.out.println(number);

        /*
            ====================================================
                    PART 4 - TYPE SAFETY
            ====================================================
        */

        System.out.println("\n========== TYPE SAFETY ==========");

        Box<String> safeBox = new Box<>();

        safeBox.setValue("Java");

        // Uncomment below line
        // safeBox.setValue(100);

        /*
            Compile-time error because:
                T = String

            Integer not allowed.
        */

        System.out.println(safeBox.getValue());

        /*
            ====================================================
                    PART 5 - RAW TYPES
            ====================================================

            Raw type means:
                Generic type not specified

            Example:
                Box box = new Box();

            This is old-style Java.
            Unsafe.
        */

        System.out.println("\n========== RAW TYPES ==========");

        Box rawBox = new Box();

        rawBox.setValue("Hello");

        // Still allowed
        rawBox.setValue(100);

        /*
            Since type isn't fixed,
            Box behaves like old Object container.
        */

        Object obj = rawBox.getValue();

        System.out.println(obj);

        /*
            Dangerous casting again possible.
        */

        try {

            String text = (String) rawBox.getValue();

            System.out.println(text);

        } catch (ClassCastException e) {

            System.out.println("Raw Type Runtime Error:");
            System.out.println(e);
        }

        /*
            ====================================================
                PART 6 - MULTIPLE TYPE PARAMETERS
            ====================================================
        */

        System.out.println("\n========== MULTIPLE TYPE PARAMETERS ==========");

        /*
            Here:
                K = Integer
                V = String
        */

        Pair<Integer, String> student = new Pair<>();

        student.set(101, "Pradnyesh");

        Integer id = student.getKey();

        String studentName = student.getValue();

        System.out.println("ID: " + id);
        System.out.println("Name: " + studentName);

        /*
            Another example:

                K = String
                V = Double
        */

        Pair<String, Double> product = new Pair<>();

        product.set("Laptop", 75000.0);

        System.out.println(product.getKey());
        System.out.println(product.getValue());

        /*
            ====================================================
                    PART 7 - ORDER MATTERS
            ====================================================

            Pair<Integer, String>
            is NOT same as

            Pair<String, Integer>
        */

        System.out.println("\n========== ORDER MATTERS ==========");

        Pair<String, Integer> age = new Pair<>();

        age.set("Age", 25);

        System.out.println(age.getKey());
        System.out.println(age.getValue());

        /*
            Uncomment below:

            Pair<Integer, String> wrongPair = new Pair<>();

            wrongPair.set("Hello", "Java");

            ERROR because:
                K should be Integer
        */

        /*
            ====================================================
                PART 8 - DIAMOND OPERATOR <>
            ====================================================

            Before Java 7:
                new Box<String>()

            After Java 7:
                new Box<>()

            Java automatically infers type.
        */

        System.out.println("\n========== DIAMOND OPERATOR ==========");

        Box<Double> doubleBox = new Box<>();

        doubleBox.setValue(15.5);

        System.out.println(doubleBox.getValue());

        /*
            ====================================================
                    PART 9 - HASHMAP CONNECTION
            ====================================================

            HashMap<K, V>

            K = Key datatype
            V = Value datatype
        */

        System.out.println("\n========== HASHMAP ==========");

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");

        System.out.println(map.get(1));
        System.out.println(map.get(2));

        /*
            Here:
                Key = Integer
                Value = String
        */

        /*
            ====================================================
                    FINAL IMPORTANT NOTES
            ====================================================

            GENERICS EXIST FOR:
            -------------------
            1. Type Safety
            2. Compile-time checking
            3. Cleaner code
            4. Removing manual casting
            5. Preventing runtime bugs

            IMPORTANT:
            ----------
            Generics work ONLY with reference types.

            VALID:
                Integer
                Double
                String

            INVALID:
                int
                double
                char

            RAW TYPES:
            ----------
            Avoid raw types in modern Java.

            Always prefer:
                Box<String>

            instead of:
                Box

            ====================================================
        */

        System.out.println("\n========== END OF TUTORIAL ==========");
    }
}
