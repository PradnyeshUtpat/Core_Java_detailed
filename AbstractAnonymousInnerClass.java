abstract class Something{

    abstract void display();
}
// I know that this method is gonna be used only once so instead of creating a separate class for it, I will create an anonymous inner class to provide the implementation for the display method of Something class.
public class AbstractAnonymousInnerClass {
    public static void main(String[] args) {
        Something obj = new Something(){
            void display(){
                System.out.println("This is anonymous inner class");
            }
        };
        obj.display();
    }
}
