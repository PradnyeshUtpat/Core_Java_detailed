package StreamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Apple","Banana","Carrot"));
        Stream<String> listStream = list.stream();
        listStream.map((element)->{
            return element.toUpperCase();
        }).forEach((element)->System.out.print(element + " "));
        System.out.println();

        List<String> list2 = new ArrayList<>(Arrays.asList("Apple","Banana","Carrot"));
        Stream<String> anotherlistStream = list2.stream();
        List<String> streamList = anotherlistStream.peek((element)->System.out.print("Before map() : " + element + " ")).map((element)->element.toUpperCase()).peek((element)->System.out.print("After map() : " + element + " ")).toList();
        System.out.println(streamList);

        System.out.println();


    }
}
