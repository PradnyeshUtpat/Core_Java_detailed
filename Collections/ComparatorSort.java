package Collections;
import java.util.*;
class ascending implements Comparator<Integer>{
    @Override
    public int compare(Integer a, Integer b){
        return a - b; // for ascending order
    }
}
class descending implements Comparator<Integer>{
    @Override
    public int compare(Integer a, Integer b){
        return a-b;
    }
}
class sizeComparatoraAsc implements Comparator<String>{
    @Override
    public int compare(String a, String b){
        return a.length() - b.length();
    }
}
public class ComparatorSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);
        list.sort(new ascending());
        list.sort(new descending());
        for(Integer i: list){
            System.out.print(i + " ");
        }
        System.out.println();
        List<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");
        list2.add("kiwi");
        list2.sort(new sizeComparatoraAsc());
        for(String s: list2){
            System.out.print(s + " ");
        }
    }
}
