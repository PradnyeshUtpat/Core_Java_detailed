package StreamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Apple","Banana","Carrot","Avocado"));
        Stream<String> listStream = list.stream();
        List<String> fruitsWithA = listStream.filter((element)->element.startsWith("A")).toList();
        System.out.println(fruitsWithA);
        List<String> appleList = list.stream().filter((element)->element=="Apple").toList();
        System.out.println(appleList);
        System.out.println();
    }
}
