public class Tricky_Relational_cases {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;

        // Case 1: Equal to or less than
        System.out.println("Case 1: " + (x <= x));  // true

        // Case 2: Greater than or equal to
        System.out.println("Case 2: " + (x >= y));  // false

        // Case 3: Not equal to or greater than
        System.out.println("Case 3: " + (y != x));  // true

        // Case 4: Combined conditions
        System.out.println("Case 4: " + (x < y && y >= 6));  // true

        // Case 5: Greater than or equal to, with parentheses
        System.out.println("Case 5: " + ((x + 1) >= (y - 1)));  // true
    }
}

