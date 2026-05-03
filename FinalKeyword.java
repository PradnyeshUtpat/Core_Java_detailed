// final keyword can be - variable , method , class
public class FinalKeyword {
    public static void main(String[] args) {
        int num = 9; // ------------> if made final no one can modify it
        num = 10;
        System.out.println(num);
    }
}

class P{ // ----------------> if made final no one can extend it
    public void show(){ // ------------> if made final no one can override it
        System.out.println("In P show");
    }
    public void add(int a , int b){
        System.out.println(a+b);
    }
}
class C extends P{
    @Override
    public void show(){
        System.out.println("In C show");
    }
}

