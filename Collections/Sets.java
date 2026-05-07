package Collections;
import java.util.*;

/*
    =========================================================
            TREESET vs LINKEDHASHSET
    =========================================================

    This file explains:

    1. LinkedHashSet
    2. TreeSet

    including:
    - ordering
    - internal working
    - duplicate handling
    - time complexity
    - sorting behavior

    ---------------------------------------------------------
    QUICK SUMMARY
    ---------------------------------------------------------

    LinkedHashSet
    -------------
    - No duplicates
    - Maintains insertion order
    - Internally uses LinkedHashMap
    - Average operations: O(1)

    TreeSet
    -------
    - No duplicates
    - Automatically sorted
    - Internally uses TreeMap
    - Operations: O(log n)

 */

public class Sets {

    public static void main(String[] args) {

        // =====================================================
        // 1. LINKEDHASHSET
        // =====================================================

        /*
            LinkedHashSet internally uses:

            LinkedHashMap

            Internally:
            element -> PRESENT

            Example internally:

            50 -> PRESENT
            10 -> PRESENT
            30 -> PRESENT

            LinkedHashSet maintains insertion order.
         */

        Set<Integer> linkedHashSet =
                new LinkedHashSet<>();

        linkedHashSet.add(50);
        linkedHashSet.add(10);
        linkedHashSet.add(30);

        System.out.println("LinkedHashSet:");
        System.out.println(linkedHashSet);

        /*
            Output:

            [50, 10, 30]

            insertion order preserved
         */


        // Duplicate values ignored
        linkedHashSet.add(10);

        System.out.println("\nAfter adding duplicate 10:");
        System.out.println(linkedHashSet);

        /*
            Still:

            [50, 10, 30]

            because Set does not allow duplicates
         */


        // contains()
        System.out.println("\nContains 30? " +
                linkedHashSet.contains(30));


        // remove()
        linkedHashSet.remove(30);

        System.out.println("\nAfter removing 30:");
        System.out.println(linkedHashSet);


        // Iteration follows insertion order
        System.out.println("\nIterating LinkedHashSet:");

        for(Integer n : linkedHashSet){
            System.out.println(n);
        }

        /*
            Time Complexity:

            add()      -> O(1)
            contains() -> O(1)
            remove()   -> O(1)

            because hashing is used internally.
         */


        System.out.println("\n====================================\n");


        // =====================================================
        // 2. TREESET
        // =====================================================

        /*
            TreeSet internally uses:

            TreeMap

            Internally:

            element -> PRESENT

            Example internally:

            50 -> PRESENT
            10 -> PRESENT
            30 -> PRESENT

            TreeMap automatically sorts keys.

            Since elements are keys,
            TreeSet automatically sorts elements.
         */

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);

        System.out.println("TreeSet:");
        System.out.println(treeSet);

        /*
            Output:

            [10, 30, 50]

            automatically sorted
         */


        // Duplicate ignored
        treeSet.add(30);

        System.out.println("\nAfter adding duplicate 30:");
        System.out.println(treeSet);


        // contains()
        System.out.println("\nContains 50? " +
                treeSet.contains(50));


        // remove()
        treeSet.remove(10);

        System.out.println("\nAfter removing 10:");
        System.out.println(treeSet);


        // Iteration follows sorted order
        System.out.println("\nIterating TreeSet:");

        for(Integer n : treeSet){
            System.out.println(n);
        }

        /*
            Output:

            30
            50
         */


        /*
            TreeSet internally uses:

            Red-Black Tree
            (self-balancing binary search tree)

            Operations:

            add()      -> O(log n)
            contains() -> O(log n)
            remove()   -> O(log n)
         */


        System.out.println("\n====================================\n");


        // =====================================================
        // IMPORTANT DIFFERENCE
        // =====================================================

        /*
            LinkedHashSet
            -------------
            maintains insertion order

            Example:
            50,10,30 -> [50,10,30]


            TreeSet
            -------
            maintains sorted order

            Example:
            50,10,30 -> [10,30,50]
         */


        // =====================================================
        // IMPORTANT RESTRICTION IN TREESET
        // =====================================================

        /*
            TreeSet elements must be sortable.

            Meaning:
            elements should implement Comparable

            OR

            Comparator should be provided.
         */


        // =====================================================
        // INTERNAL STRUCTURE COMPARISON
        // =====================================================

        /*
            HashSet
            --------
            HashMap internally


            LinkedHashSet
            --------------
            LinkedHashMap internally


            TreeSet
            --------
            TreeMap internally
         */




    }
}