interface I{
    void show();
    static void display(){
        System.out.println("In static method of interface");
    }
}

class IntClass implements I{
    public void show(){
        System.out.println("In show method of IntClass");
    }
    static void display(){
        System.out.println("In display method of IntClass");
    }
}
public class InterfacePlayground {
    public static void main(String[] args) {
        I obj = new IntClass();
        obj.show();
        IntClass.display(); // In display method of IntClass
        I.display(); // In static method of interface
        // If display method is not static in IntClass then we can call it using object reference but if it is static then we can call it using class name or interface name. Static methods in interfaces are not inherited by implementing classes, so they cannot be called on instances of those classes. Instead, they must be called using the interface name.
    }

}
