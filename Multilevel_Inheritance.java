public class Multilevel_Inheritance {
    public static void main(String[] args)
    {
        //Calc obj=new Calc();
        AdvCalc obj=new AdvCalc();
        int r1=obj.add(4, 5);
        int r2=obj.sub(7,3);
        int r3=obj.multi(5,3);
        int r4=obj.div(15,4);
        obj.num = 1;

        System.out.println(r1+" "+r2);

    }
}

class Calc1
{
    int num;
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int sub(int n1, int n2)
    {
        return n1-n2;
    }
}


class AdvCalc1 extends Calc
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