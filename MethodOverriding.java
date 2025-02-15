public class MethodOverriding {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}

class Parent {
    public void show(){
        System.out.println("In A show");
    }
}

class Child extends Parent{
    @Override
    public void show(){
        System.out.println("In B show");
    }
}