public class Type_conversion_Casting {
    public static void main(String[] args) {
        float f = 9.9f;
        int i = (int) f; // explicit type casting - converting float to int, fractional part will be lost
        System.out.println(i);



        byte b = 127;
        int a = 257 ;
        // a = b;  // implicit type conversion - converting byte to int, no data loss
        // System.out.println(a);
        b = (byte) a; //explicit - type casting 257%rangeOfTypeToBeConvertedTo = 257%256 = 1
        System.out.println(b);


        byte s = 10;
        byte t = 30;
        int res = t*s;
        long ans = 100000000L;
        int b1 = 450;
        ans = b1;
        System.out.println(ans);
        System.out.println(res); //Type promotion
    }
}
