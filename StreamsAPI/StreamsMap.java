package StreamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsMap {
    public static void main(String[] args) {

        //map method
        List<String> list = new ArrayList<>(Arrays.asList("Apple","Banana","Carrot"));
        Stream<String> listStream = list.stream();
        listStream.map((element)->{
            return element.toUpperCase();
        }).forEach((element)->System.out.print(element + " "));
        System.out.println();

        //peek method
        List<String> list2 = new ArrayList<>(Arrays.asList("Apple","Banana","Carrot"));
        Stream<String> anotherlistStream = list2.stream();
        List<String> streamList = anotherlistStream.peek((element)->System.out.print("Before map() : " + element + " ")).map((element)->element.toUpperCase()).peek((element)->System.out.print("After map() : " + element + " ")).toList();
        System.out.println(streamList);

        // Code to find average
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        double avg =numbers.stream().mapToInt(element->element).average().getAsDouble();
        System.out.println(avg);

        //Find square of first 3 even numbers
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        List<Integer> evenNums = nums.stream().filter(element->element%2==0).toList();
        List<Double> evenSquares = evenNums.stream().map((element)->Math.pow(element,2)).limit(3).toList();
        System.out.println(evenNums);
        System.out.println(evenSquares);

        // code to find max in a stream
        List<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int max =num.stream().mapToInt(element->element).max().getAsInt();
        System.out.println(max);

    }
}
