package Generics;

class genClass1<T> implements genInterface<T>{
    private T item;

    @Override
    public void set(T val){
        this.item = val;
    }

    @Override
    public T get(){
        return item;
    }
}
public class GenericInterface2 {
    public static void main(String[] args) {
        genClass1<Integer> gen = new genClass1<>();
        gen.set(100);
        System.out.println(gen.get());
    }
}
