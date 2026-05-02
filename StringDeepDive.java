public class StringDeepDive {

    public static void main(String[] args) {

        // ===============================
        // 1. STRING LITERALS (STRING POOL)
        // ===============================
        String s1 = "Hello";   // Goes to String Pool
        String s2 = "Hello";   // Reuses same pooled object

        // Both point to same object
        System.out.println("s1 == s2: " + (s1 == s2)); // true


        // ===============================
        // 2. USING new String()
        // ===============================
        String s3 = new String("Hello");

        // "Hello" literal is reused from pool
        // BUT new object is created in heap

        System.out.println("s1 == s3: " + (s1 == s3)); // false
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true


        // ===============================
        // 3. INTERN() METHOD
        // ===============================
        String s4 = s3.intern();

        // intern() returns reference from pool
        System.out.println("s1 == s4: " + (s1 == s4)); // true


        // ===============================
        // 4. COMPILE-TIME CONCATENATION
        // ===============================
        String c1 = "Hello" + "World"; // compile-time → pooled

        String c2 = "HelloWorld";

        System.out.println("c1 == c2: " + (c1 == c2)); // true


        // ===============================
        // 5. RUNTIME CONCATENATION
        // ===============================
        String a = "Hello";
        String b = "World";

        String c3 = a + b; // runtime → heap object

        System.out.println("c2 == c3: " + (c2 == c3)); // false

        // Force into pool
        String c4 = c3.intern();
        System.out.println("c2 == c4: " + (c2 == c4)); // true


        // ===============================
        // 6. IMMUTABLE NATURE OF STRING
        // ===============================
        String str = "Hi";

        str.concat(" There"); // does NOT change original

        System.out.println("After concat (ignored): " + str); // Hi

        str = str.concat(" There"); // new object created

        System.out.println("After reassignment: " + str); // Hi There


        // ===============================
        // 7. STRINGBUFFER (MUTABLE)
        // ===============================
        StringBuffer sb1 = new StringBuffer("Hello");

        // StringBuffer object is in heap
        // "Hello" literal is in pool

        StringBuffer sb2 = sb1; // both point to same object

        sb1.append(" World"); // modifies SAME object

        System.out.println("sb1: " + sb1); // Hello World
        System.out.println("sb2: " + sb2); // Hello World

        System.out.println("sb1 == sb2: " + (sb1 == sb2)); // true


        // ===============================
        // 8. CONVERT STRINGBUFFER → STRING
        // ===============================
        String s5 = sb1.toString();

        // New String object created in heap
        // "Hello World" is NOT added to pool automatically

        System.out.println("s5: " + s5);


        // ===============================
        // 9. IDENTITY HASHCODE (OBJECT ID)
        // ===============================
        System.out.println("\n--- Identity HashCodes ---");

        System.out.println("s1: " + System.identityHashCode(s1));
        System.out.println("s2: " + System.identityHashCode(s2));
        System.out.println("s3: " + System.identityHashCode(s3));
        System.out.println("s4: " + System.identityHashCode(s4));
        System.out.println("s5: " + System.identityHashCode(s5));
        System.out.println("sb1: " + System.identityHashCode(sb1));
        System.out.println("sb2: " + System.identityHashCode(sb2));


        // ===============================
        // 10. FINAL MEMORY SUMMARY
        // ===============================
        /*
        STRING POOL:
            "Hello"
            "HelloWorld"
            (maybe others depending on execution)

        HEAP:
            s3 → new "Hello"
            sb1/sb2 → "Hello World" (same object)
            s5 → "Hello World" (new String object)

        KEY POINTS:
        - String is immutable → new object on change
        - StringBuffer is mutable → same object changes
        - Pool stores only literals (or interned strings)
        - new String() always creates heap object
        */
    }
}