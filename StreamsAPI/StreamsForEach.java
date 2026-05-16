package StreamsAPI;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class ascending implements Comparator<Integer>{
    @Override
    public int compare(Integer a, Integer b){
        return a - b; // for ascending order
    }
}
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



        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        // code to find second largest
        int second = nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(second);

        // code to find second smallest
        int secondMin = nums.stream().distinct().sorted(new ascending()).skip(1).findFirst().get();
        System.out.println(secondMin);

        //sum of stream
        int sum = nums.stream().mapToInt(element->element).sum();
        System.out.println(sum);

        //sum of digits of a number
        int num = 12345;
        IntStream intStream = String.valueOf(num).chars();
        long sumOfDigits = intStream.map(ch->Character.getNumericValue(ch)).sum();        
        System.out.println(sumOfDigits);

    }

}
