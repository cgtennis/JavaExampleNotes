import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamIterate {

    public static void main(String[] args) {

        IntStream.rangeClosed(1,10).forEach(System.out::println);

        List<String> myList =  IntStream.range(1,10).mapToObj(i -> "a"+String.valueOf(i)).toList();
        System.out.println(myList);
    }
}
