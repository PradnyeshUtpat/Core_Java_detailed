package Generics;
import java.util.*;
/*
Create a generic class that can:

Store a value of any datatype
Return that stored value safely

The datatype should be decided when the object is created.
*/

class Container<T>{
    private T value;
    public void set(T value){
        this.value = value;
    }
    public T get(){
        return this.value;
    }
}
public class GenericBasic{
    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<>();
        intContainer.set(42);
        System.out.println("Integer value: " + intContainer.get());

        Container<String> stringContainer = new Container<>();
        stringContainer.set("Hello, Generics!");
        System.out.println("String value: " + stringContainer.get());

        Container<Double> doubleContainer = new Container<>();
        doubleContainer.set(3.14);
        System.out.println("Double value: " + doubleContainer.get());
    }
}
