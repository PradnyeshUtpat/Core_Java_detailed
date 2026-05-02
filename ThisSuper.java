public class ThisSuper {
    public static void main(String[] args)
    {

        //B obj=new B();
        B obj=new B(5);
    }
}
class Parent
{
    static{
        System.out.println("in static block of parent");
    }
    public Parent()
    {
        System.out.println("in parent");
    }
}
//super()
class A extends Parent
{
    public static int a = 10;
    static{
        
        System.out.println("in static block of A"); //static block is called when class is loaded in memory and it is called only once
        // super(); //super cannot be used in static block as super is used to call constructor of superclass and static block is not a constructor
        // this(); //this cannot be used in static block as this is used to call constructor of same class and static block is not a constructor
    }
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
        // super(5);
        System.out.println("in B");
    }
    public B(int n)
    {
        //super();   //call default constructor of super class
        //super(n);
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



//If you dont write a constructor java will create a default one.
//So for child constructor when super() is called, it calls the default constructor of the superclass
//But if you write a constructor in superclass then default constructor is not created and if you call super() in child class then it will give error as there is no default constructor in superclass
// super() should be the first statement in the constructor and if you write any statement before super() then it will give error as super() should be the first statement in the constructor


/* in static block of parent
in static block of A
in parent
in A
in B int
*/