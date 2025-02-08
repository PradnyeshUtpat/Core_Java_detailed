public class Variables {
    public static void main(String args[]) {
        int num;
        num = 3;
        double marks = 1.4d;
        short  p_ = 1;
        float p = 6.0f;
        long l = 10000l;
        String z;
        z = "hi buddy";
        System.out.println(z);
        System.out.println(p);
        System.out.println(marks);
        System.out.println(num);
        System.out.println(num + marks + p + p_);
        System.out.println(l);
        boolean b = true;
        System.out.println(b);
        char c = 'k';
        System.out.println(c);
        //byte , short , int , long 
        //double , float
        //boolean
        //char
    }
}


//values of variables are called literals

/*
1. byte
Size: 1 byte (8 bits)
Range: -128 to 127
Formula: -(2^(n-1)) to (2^(n-1) - 1)
where n = 8
Range = -2^7 to (2^7 - 1)
2. short
Size: 2 bytes (16 bits)
Range: -32,768 to 32,767
Formula: -(2^(n-1)) to (2^(n-1) - 1)
where n = 16
Range = -2^15 to (2^15 - 1)
3. int
Size: 4 bytes (32 bits)
Range: -2,147,483,648 to 2,147,483,647
Formula: -(2^(n-1)) to (2^(n-1) - 1)
where n = 32
Range = -2^31 to (2^31 - 1)
4. long
Size: 8 bytes (64 bits)
Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
Formula: -(2^(n-1)) to (2^(n-1) - 1)
where n = 64
Range = -2^63 to (2^63 - 1)
5. float
Size: 4 bytes (32 bits)
Range: Approximately ±3.40282347E+38F
Formula: IEEE 754 Standard
6. double
Size: 8 bytes (64 bits)
Range: Approximately ±1.79769313486231570E+308
Formula: IEEE 754 Standard
7. boolean
Size: Not precisely defined (typically 1 bit but JVM-specific)
Range: true or false
        8. char
Size: 2 bytes (16 bits)
Range: '\u0000' (0) to '\uffff' (65,535)
Formula: 0 to (2^n - 1)
where n = 16
*/
