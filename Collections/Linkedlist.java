package Collections;
import java.util.*;
public class Linkedlist {
    public static void main(String[] args) {    
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for(Integer i: list){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Adding element at the beginning and end of the list");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(0);
        linkedList.addLast(5);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        for(Integer i: linkedList){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Removing first and last element");
        linkedList.removeFirst();
        linkedList.removeLast();
        for(Integer i: linkedList){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(linkedList.size());
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("Monday","Tuesday"));
        list2.addFirst("Sunday");
        list2.addLast("Wednesday");
        for(String s: list2){
            System.out.print(s + " ");
        }
        list2.removeIf(x -> x.startsWith("T"));
        System.out.println();
        for(String s: list2){
            System.out.print(s + " ");
        }
    }
}
