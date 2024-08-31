public class Calculator_class {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        Calculator calc = new Calculator();
        calc.add(num1,num2);
    }
}
class Calculator{
    int a;
    public int add(int n1 , int n2){
        int r = n1+n2;
        return r;
    }
}
