public class WrapperClasses {
    public static void main(String[] args) {
        int num = 7;
        // Integer num1 = new Integer(9); -----> boxing
        Integer num1 = 9;
        System.out.println(num1);

        // int num2 = num1.intValue(); ----> un-boxing
        int num2 = num1;
        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3 *  2);
        Boolean bool = Boolean.parseBoolean("true");
        System.out.println(bool);
        Character ch = 'a';
        System.out.println(ch);
        Float f = 3.14f;
        System.out.println(f); 
        System.out.println(Float.valueOf("3.14"));
    }
}
