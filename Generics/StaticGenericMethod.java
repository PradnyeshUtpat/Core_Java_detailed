package Generics;
class Printer{
    public static <T> T print(T val){
        return val;
    }
    public static <T> void print2(T val){
        System.out.println(val);
    }

}
public class StaticGenericMethod {
    public static void main(String[] args) {
        String name = Printer.print("Pradnyesh");
        System.out.println(name);
        Printer.print2("Utpat");
    }
}
