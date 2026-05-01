public class Literals {
    public static void main(String[] args) {
        int num = 10_00_000;
        double num1 = 1e11;
        int num2 = 0b101;
        int num3 = 0xF;
        char c = 'a';
        c++;
        System.out.println(c);
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        double d = 1.0;
        // int i = d; // This will cause a compile-time error because of incompatible types
        int i = (int) d; // This is correct, but it will truncate the decimal part
        System.out.println(i);
    }
}
