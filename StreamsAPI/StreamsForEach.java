package StreamsAPI;
import java.util.*;
import java.util.stream.Stream;
public class StreamsForEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Stream<Integer> listStream = list.stream();
        listStream.forEach((element)->{
            System.out.print(element+" ");
        });
        System.out.println();

        String[] array = {"Apple","Banana"};
        Stream<String> stringStream = Arrays.asList(array).stream();
        stringStream.forEach((element)->System.out.print(element + " "));
        System.out.println();

        Set<Integer> set = new HashSet<>(list);
        Stream<Integer> setStream = set.stream();
        setStream.forEach((element)->System.out.print(element + " "));
        System.out.println();


        Map<String,Integer> map = new HashMap<>();
        map.put("Pradnyesh",1);
        map.put("Ankit",2);
        map.put("Kartik",3);
        Stream<Map.Entry<String,Integer>> entrySetStream = map.entrySet().stream();
        entrySetStream.forEach((element)->System.out.print(element + " "));
        System.out.println();


        Stream<String> keyStream = map.keySet().stream();
        keyStream.forEach((element)->System.out.print(element + " "));
        System.out.println();


        Stream<Integer> valStream = map.values().stream();
        valStream.forEach((element)->System.out.print(element + " ")); 
    }

}
