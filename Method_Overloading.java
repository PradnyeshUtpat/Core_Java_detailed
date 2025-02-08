public class Method_Overloading {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        int num3 = 6;

        Calculator1 calc = new Calculator1();
        int r = calc.add(num1,num2,num3);
        System.out.println(r);
    }
}
class Calculator1{
    int a;
    public int add(int n1 , int n2){
        return n1+n2;
    }
    public int add(int n1 , int n2 , int n3){
        return n1+n2+n3;
    }
    public double add(double n1 , double n2){
        return n1+n2;
    }


}
