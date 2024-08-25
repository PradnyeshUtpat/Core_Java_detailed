public class Logical_Operators {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 8;

        // Logical AND (&&)
        boolean resultAnd = (x < y) && (y >= z);
        System.out.println("Logical AND: " + resultAnd);  // true

        // Logical OR (||)
        boolean resultOr = (x < y) || (z > y);
        System.out.println("Logical OR: " + resultOr);   // true

        // Logical NOT (!)
        boolean resultNotX = !(x == y);
        System.out.println("Logical NOT for 'x == y': " + resultNotX);  // true

        boolean resultNotZ = !(z <= y);
        System.out.println("Logical NOT for 'z <= y': " + resultNotZ);  // false

        System.out.println(0 & 6);
    }
}

