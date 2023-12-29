package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamGroupBySort {

    public static void main(String[] args)
    {

        List<Integer> myList = Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5, 1);

        Map<Integer, Long> result = myList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed()) // reversed for descending order
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(result);

    }

}
