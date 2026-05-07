package Collections;
import java.util.*;

/*
    =========================================================
                HASHMAP vs LINKEDHASHMAP vs TREEMAP
    =========================================================

    This file explains:

    1. HashMap
    2. LinkedHashMap
    3. TreeMap

    along with:
    - ordering
    - internal working
    - time complexity
    - duplicate key behavior
    - sorting behavior

    ---------------------------------------------------------
    QUICK SUMMARY
    ---------------------------------------------------------

    HashMap
    --------
    - No insertion order
    - No sorting
    - Uses hashing + buckets
    - Fastest average lookup: O(1)

    LinkedHashMap
    -------------
    - Maintains insertion order
    - Uses HashMap + doubly linked list
    - Average lookup: O(1)

    TreeMap
    -------
    - Automatically sorts keys
    - Uses Red-Black Tree
    - Lookup: O(log n)

 */

public class Maps {

    public static void main(String[] args) {

        // =====================================================
        // 1. HASHMAP
        // =====================================================

        /*
            HashMap internally uses:

            array of buckets

            Each bucket may contain:
            - linked list
            - tree (Java 8+ if collisions increase)

            HashMap does NOT maintain:
            - insertion order
            - sorting
         */

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(50, "A");
        hashMap.put(10, "B");
        hashMap.put(30, "C");

        System.out.println("HashMap:");
        System.out.println(hashMap);

        /*
            Output order may vary:

            {10=B, 50=A, 30=C}

            OR something else

            because HashMap uses hashing.
         */

        // Duplicate key updates value
        hashMap.put(10, "UPDATED");

        System.out.println("After updating key 10:");
        System.out.println(hashMap);

        // get()
        System.out.println("Value of key 50: " + hashMap.get(50));

        // containsKey()
        System.out.println("Contains key 30? " +
                hashMap.containsKey(30));

        // remove()
        hashMap.remove(30);

        System.out.println("After removing 30:");
        System.out.println(hashMap);

        /*
            Average Time Complexity:

            put()    -> O(1)
            get()    -> O(1)
            remove() -> O(1)

            Worst case:
            O(n) due to collisions
         */


        System.out.println("\n====================================\n");


        // =====================================================
        // 2. LINKEDHASHMAP
        // =====================================================

        /*
            LinkedHashMap =
            HashMap + doubly linked list

            It maintains insertion order.

            Internally TWO structures exist:

            1. Buckets for fast lookup
            2. Doubly linked list for insertion order
         */

        Map<Integer, String> linkedHashMap =
                new LinkedHashMap<>();

        linkedHashMap.put(50, "A");
        linkedHashMap.put(10, "B");
        linkedHashMap.put(30, "C");

        System.out.println("LinkedHashMap:");
        System.out.println(linkedHashMap);

        /*
            Output:

            {50=A, 10=B, 30=C}

            insertion order preserved
         */

        // Updating value does NOT change position
        linkedHashMap.put(10, "UPDATED");

        System.out.println("After updating key 10:");
        System.out.println(linkedHashMap);

        /*
            Still:

            {50=A, 10=UPDATED, 30=C}
         */

        // Iteration follows insertion order
        System.out.println("\nIterating LinkedHashMap:");

        for(Map.Entry<Integer, String> entry :
                linkedHashMap.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " +
                    entry.getValue()
            );
        }

        /*
            Average Time Complexity:

            put()    -> O(1)
            get()    -> O(1)
            remove() -> O(1)

            Slightly slower than HashMap
            because linked structure is maintained.
         */


        System.out.println("\n====================================\n");


        // =====================================================
        // 3. TREEMAP
        // =====================================================

        /*
            TreeMap internally uses:

            Red-Black Tree
            (self-balancing binary search tree)

            TreeMap automatically sorts keys.
         */

        Map<Integer, String> treeMap =
                new TreeMap<>();

        treeMap.put(50, "A");
        treeMap.put(10, "B");
        treeMap.put(30, "C");

        System.out.println("TreeMap:");
        System.out.println(treeMap);

        /*
            Output:

            {10=B, 30=C, 50=A}

            keys automatically sorted
         */

        // Duplicate key updates value
        treeMap.put(10, "UPDATED");

        System.out.println("After updating key 10:");
        System.out.println(treeMap);

        // TreeMap traversal is sorted
        System.out.println("\nIterating TreeMap:");

        for(Map.Entry<Integer, String> entry :
                treeMap.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " +
                    entry.getValue()
            );
        }

        /*
            Time Complexity:

            put()    -> O(log n)
            get()    -> O(log n)
            remove() -> O(log n)

            because tree traversal is used.
         */


        System.out.println("\n====================================\n");


        // =====================================================
        // FINAL COMPARISON
        // =====================================================

        /*
            HashMap
            --------
            - No order
            - Fastest average performance
            - Uses hashing

            LinkedHashMap
            -------------
            - Maintains insertion order
            - Uses hashing + linked list

            TreeMap
            -------
            - Maintains sorted order
            - Uses Red-Black Tree
         */




        /*
            HashMap:
            --------
            hashCode() finds bucket
            equals() checks equality

            TreeMap:
            --------
            compareTo()/Comparator used for sorting

         */


        

    }
}