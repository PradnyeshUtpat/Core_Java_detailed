public class ThisSuper {
    public static void main(String[] args)
    {

        //B obj=new B();
        B obj=new B(5);
    }
}

//super()
class A
{
    public A()
    {
        super();
        System.out.println("in A");
    }
    public A(int n)
    {
        super();
        System.out.println("in A int");
    }
}
class B extends A
{
    public B()
    {
        //super();
        super(5);
        System.out.println("in B");
    }
    public B(int n)
    {
        //super();   //call default constructor of super class
        super(n);
        System.out.println("in B int");
    }
}



//this()
class A1
{
    public A1()
    {
        super();
        System.out.println("in A1");
    }
    public A1(int n)
    {
        super();
        System.out.println("in A1 int");
    }
}

class B1 extends A1
{
    public B1()
    {
        super();
        System.out.println("in B");
    }
    public B1(int n)
    {

        this();  //call constructor of same class
        System.out.println("in B1 int");
    }
}

//when a object is initialised constructor is called
//Before the subclass , superclass constructor is called
//u can change which superclass constructor is called based on the super() method