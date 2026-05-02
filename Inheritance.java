public class Inheritance {
    public static void main(String a[])
    {
        //Calc obj=new Calc();
        AdvCalc obj=new AdvCalc();
        int r1=obj.add(4, 5);
        int r2=obj.sub(7,3);
        int r3=obj.multi(5,3);
        int r4=obj.div(15,4);
        //Calc obj1=new Calc();
        //obj1.div(15,4); // This will give error as div method is not present in Calc class
        System.out.println(obj.num);
        System.out.println(r1+" "+r2);
        System.out.println(r3+" "+r4);
    }
}

class Calc
{
    public int num = 10;
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int sub(int n1, int n2)
    {
        return n1-n2;
    }
}


class AdvCalc extends Calc
{

    public int multi(int n1, int n2)
    {
        return n1*n2;
    }
    public int div(int n1, int n2)
    {
        return n1/n2;
    }


}