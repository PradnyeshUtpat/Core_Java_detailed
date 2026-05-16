package Generics;

class Pair<K,V>{
    private K key;
    private V value;
    void setKey(K key){
        this.key = key;
    }
    public K getKey(){
        return this.key;
    }
    public void setValue(V value){
        this.value = value;
    }
    public V getValue(){
        return this.value;
    }
    public void show(){
        System.out.println("Key: " + getKey() + " Value: " + getValue());
    }
}
public class KeyValueGeneric {
    public static void main(String[] args) {
        Pair<String,Integer> student = new Pair<String,Integer>();
        student.setKey("Pradnyesh");
        student.setValue(15);
        student.show();
    }
}
