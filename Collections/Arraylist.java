package Collections;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        System.out.println(list.get(1));
        System.out.println(list.size());
        for(Integer i: list){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("-----------------------------");
        List<String> l = Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday");
        for(String s: l){
            System.out.print(s + " ");
        }
        // l.add("Saturday"); // UnsupportedOperationException
        System.out.println();
        String[] arr = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        List<String> l2 = Arrays.asList(arr);
        for(String s: l2){
            System.out.print(s + " ");  
        }
        System.out.println();
        System.out.println("------------------------------");

        // convert fixed size to resizable list
        List<String> l3 = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday"));
        l3.add("Saturday");
        for(String s: l3){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        List<Integer> list3 = List.of(5,6);
        list2.addAll(list3);
        for(Integer i: list2){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Removal of elements");
        List<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.remove(2); // removes element at index 2
        System.out.println(Integer.valueOf(2)); // prints 2
        list4.remove(Integer.valueOf(2)); // removes the first occurrence of 2
        for(Integer i: list4){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
