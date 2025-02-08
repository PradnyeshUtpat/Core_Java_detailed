public class Type_conversion_Casting {
    public static void main(String[] args) {
        float f = 9.9f;
        int i = (int) f; // implicit - type conversion
        System.out.println(i);

        //Type casting

        byte b = 127;
        int a = 257;
        // a = b;
        // System.out.println(a);
        b = (byte) a; //explicit - type casting
        System.out.println(b);


        byte s = 10;
        byte t = 30;
        int res = t*s;
        System.out.println(res); //Type promotion
    }
}
