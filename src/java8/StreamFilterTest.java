package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterTest {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "node", "x","y","mkyong");
        List<String> result = lines.stream().filter(x -> !x.equals("mkyong")).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
