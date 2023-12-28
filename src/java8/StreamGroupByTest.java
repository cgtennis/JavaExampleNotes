package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGroupByTest {

    public static void main(String[] args) {

        List<String> keywords = Arrays.asList("Apple","Bananas","Mango","Cherry","Bananas","Apple","Cherry","Bananas");

        //simple group by (1 parameters for groupingby)
        Map<String, List<String>> result1 = keywords.stream().collect(Collectors.groupingBy(word -> word));
        System.out.println(result1);

        //group by with count (2 parameters for groupingby)
        Map<String, Long> result2 = keywords.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result2);

        //group by, map and count
        Map<String, Long> result3 = keywords.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result3);

    }
}
