package Generics;

class genClass implements genInterface<String>{
    private String item;

    @Override
    public void set(String val){
        this.item = val;
    }

    @Override
    public String get(){
        return item;
    }
}
public class GenericInterface1 {
    public static void main(String[] args) {
        genClass gen = new genClass();
        gen.set("Pradnyesh");
        System.out.println(gen.get());
    }
}
