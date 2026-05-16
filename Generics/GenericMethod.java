package Generics;

class Print{
    <T> void display(T value){
        System.out.println(value);
    }
    public <T> T returnValue(T value){
        return value;
    }
}
public class GenericMethod {
    public static void main(String[] args) {
        Print print = new Print();
        print.display("Pradnyesh");
        print.display(10);
        print.display(true);
        String val = print.returnValue("Utpat");
        System.out.println(val);
    }
}
