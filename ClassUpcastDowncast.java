// refer dynamic method dispatch
class Up
{
    public void show1()
    {
        System.out.println("in A show");
    }
}
class Down extends Up
{
    public void show2()
    {
        System.out.println("in show B");
    }
}

public class ClassUpcastDowncast{
    public static void main(String[] args) {

//    	double d=4.5;
//    	int i=(int)d;
//
//    	System.out.println(i);

    	Up obj= new Up();
    	obj= (Up) new Down();   //upcasting
    	obj.show1();
        //obj.show2(); will give error

        obj=new Down();
        obj.show1();

        Down obj1=(Down)obj;
        obj1.show2(); // this will not give error
    }
}

