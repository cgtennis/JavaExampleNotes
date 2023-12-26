import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenericsTest {

    static Integer[] myIntArray = new Integer[] {1,2,3,4,5};
    static String[] myStrArray = new String[] {"apple","orange","banana","grape","kiwi","watermelon"};

    public static <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }


    public static void main(String[] args) {
        System.out.println("int array length: "+myIntArray.length);
        //convert Integer array to List and display
        System.out.println("Integer list: "+ fromArrayToList(myIntArray));

        System.out.println("string array length: "+myStrArray.length);
        //convert String array to List and display
        System.out.println("string list: "+ fromArrayToList(myStrArray));
    }
}
