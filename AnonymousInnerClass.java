class SomeClass{
    void show(){
        System.out.println("This is some class");
    }
}
class ChildClass extends SomeClass{
    void show(){
        System.out.println("This is child class");
    }
}

// I know that this class is gonna be used only once to override the show method of SomeClass, so I am not gonna create a separate class for it. I will create an anonymous inner class to override the show method of SomeClass.

public class AnonymousInnerClass {
    public static void main(String[] args) {
        SomeClass obj = new ChildClass(){
            void show(){
                System.out.println("This is anonymous inner class");
            }
        };
        obj.show();
    }
}

// Precedence : Anonymous inner class > Child class > Parent class
