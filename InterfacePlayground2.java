public class InterfacePlayground2 {
    public static void main(String[] args) {
        Z z = new Z();
        z.show();
        Y z1 = new Z1();
        z1.show();
    }
}
interface A2 {
    static void show() {
        System.out.println("A show()");
    }
}

interface B2 {
    default void show() {
        System.out.println("B show()");
    }
}
class Z implements A2, B2 {
    @Override
    public void show() {
        // We have to override the show method because there is a conflict between A and B interfaces as both have default show method. So we have to provide our own implementation of show method in Z class to resolve the conflict.
        System.out.println("Z show()");
        A2.show(); // we can use only if show is default in A interface. If show is static in A interface then we cannot use super keyword to call it. We have to call it using interface name like A.show();
        B2.super.show(); // we can use super keyword to call default method of B interface because it is default method. If it is static method then we cannot use super keyword to call it. We have to call it using interface name like B.show();
    }
}
class Z1 extends Y{
    @Override
    public void show() {
        System.out.println("Z1 show()");
    }
}
class Y implements A2, B2 {
    @Override
    public void show() {
        System.out.println("Y show()");
    }
}