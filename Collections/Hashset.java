package Collections;
import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(5,0.5f);
        System.out.println(hs.size());
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        System.out.println(hs.add(1));
        hs.remove(1);
        // hs.removeAll(hs); // this will remove all the elements from the hashset and make it empty.
        // hs.clear(); // this will also remove all the elements from the hashset and make it empty.
        hs.addAll(Arrays.asList(1,2,3,5));
        for(Integer i: hs){
            System.out.print(i + " "); 
        }
        System.out.println();
        System.out.println(hs.contains(3));
        System.out.println(hs.contains(6));
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Monday");
        lhs.add("Tuesday");
        lhs.add("Wednesday");
        lhs.add("Thursday");
        lhs.add("Friday");
        lhs.addFirst("Sunday");
        for(String s: lhs){
            System.out.print(s + " ");
        }
    }
}
