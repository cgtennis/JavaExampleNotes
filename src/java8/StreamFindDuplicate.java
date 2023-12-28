package java8;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *   Goal: Given a list of number string, find the occurrence of duplicate
 *
 *   grouping by itself using Function.identity(), return a Map of <String, List<String>>
 *   get entrySet() of map, convert to stream, filter by size()>1, (note that input is Map.Entry Interface)
 *   map() transform each element of stream using a provided function
 *   finally collect results: converting to list
 */
public class StreamFindDuplicate {

    public static void main(String[] args) {



        List<String> myMap = Stream.of("1", "2", "3", "3", "5", "7", "7", "7")
                .collect(Collectors.groupingBy(Function.identity()))
                .entrySet().stream().filter(entry -> entry.getValue().size() > 1)
                .map(entry -> "\""+entry.getKey() + "\": " + entry.getValue().size())
                .collect(Collectors.toList());

        System.out.println(myMap);
    }
}
