package Generics;
 
class Calculate<T extends Number>{
    T value;
    public void square(T value){
        System.out.println(); 
    }
}
public class BoundedGeneric {
    public static void main(String[] args) {
        Calculate<Integer> cal = new Calculate<>();
        cal.square(10);
    }
}
