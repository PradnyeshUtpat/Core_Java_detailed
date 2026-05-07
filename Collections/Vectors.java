package Collections;
import java.util.*;
public class Vectors {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        for(Integer i: vector){
            System.out.print(i + " ");
        }
        System.out.println();
        Vector<Integer> vector2 = new Vector<>(2,4);
        vector2.add(1);
        vector2.add(2);
        System.out.println(vector2.size() + " " + vector2.capacity());
        vector2.add(3);
        vector2.add(4);
        System.out.println(vector2.size() + " " + vector2.capacity());
        vector2.add(5);
        System.out.println(vector2.size() + " " + vector2.capacity());
        // add, addAll, remove, removeAll, clear, get, set, size, capacity, isEmpty, contains are same as ArrayList.
    }
}
