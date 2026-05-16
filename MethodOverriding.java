public class MethodOverriding {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}

class Parent2 {
    public void show(){
        System.out.println("In A show");
    }
}

class Child extends Parent2{
    @Override
    public void show(){
        System.out.println("In B show");
    }
}