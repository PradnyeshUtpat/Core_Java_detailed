public class Method_Overloading {
    public static void main(String[] args) {
        double num1 = 4.0;
        double num2 = 5.0;
        int num3 = 6;
        Calculator calc = new Calculator();
        double r = calc.add(num1,num2);
        System.out.println(r);
    }
}
class Calculator{
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
