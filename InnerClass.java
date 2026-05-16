class Parent1{
    int a;
    int b;
    public void display(){
        System.out.println("This is parent class");
    }
    class inner{
        int b;
        void display(){
            System.out.println("This is inner class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        Parent1.inner in = p.new inner();
        
        //Parent.inner in = new Parent.inner();  ----> static class
        in.display();
        new Parent1().display();
    }
}

//static can be used only for inner classes, not for outer classes. Static inner classes can be instantiated without an instance of the outer class, while non-static inner classes require an instance of the outer class to be instantiated.

/* 

| Thing              | How to use           | 
| ------------------ | ---------------------|
| Static inner class | Outer.Inner          |
| Create object      | new Outer.Inner()    |
| Call static method | Outer.Inner.method() |

*/
