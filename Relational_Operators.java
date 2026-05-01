public class Relational_Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Equal to
        System.out.println("Equal to: " + (a == b));  // false

        // Not equal to
        System.out.println("Not equal to: " + (a != b));  // true

        // Greater than
        System.out.println("Greater than: " + (a > b));  // false

        // Less than
        System.out.println("Less than: " + (a < b));  // true

        // Greater than or equal to
        System.out.println("Greater than or equal to: " + (a >= b));  // false

        // Less than or equal to
        System.out.println("Less than or equal to: " + (a <= b));  // true

        System.out.println("Some cool examples of relational operators");
        int n = 6;
        double g = 6.0;
        System.out.println(n==g);
        System.out.println(g==n);

        int p = 45;
        long p1 = 45L;
        System.out.println(p==p1);
        System.out.println(p1==p);
    }
}
