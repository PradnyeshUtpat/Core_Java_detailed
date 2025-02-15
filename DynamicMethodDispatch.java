// class Computer
// {
//
// }
// class Laptop extends Computer
// {
//
// }

class Outer
{
    public void show1()
    {
        System.out.println("in A show1");
    }
    public void show(){
        System.out.println("In A show"); // without this our code will fail in compile time
    }
}

class Inner1 extends Outer
{
    @Override
    public void show()
    {
        System.out.println("in B show");
    }
}

class Inner2 extends Outer
{
    @Override
    public void show()
    {
        System.out.println("in C show");
    }
}

class D
{

}


public class DynamicMethodDispatch{
    public static void main(String[] args) {

        Outer obj = new Inner1();
        obj.show();


        Outer obj1=new Outer();
        obj1.show();

        obj1=new Inner1();
        obj1.show();

        obj1=new Inner2();
        obj1.show();

//		obj1=new D(); -----> wont work

//		Laptop obj1=new Laptop();
//		Computer obj1=new Laptop();

    }
}