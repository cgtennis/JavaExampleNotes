package collection;

import java.util.Arrays;
import java.util.List;

public class ListArrayTest {
    public static void main(String[] args) {

        List<String> myList = List.of("How","are","you","?");
        System.out.println(myList);

        Integer[] a = new Integer[] {1,2,3,4};
        List<Integer> b = Arrays.asList(a);
        b.set(2,15);
        for (Integer integer : a) System.out.println(integer);


        String[] colorsArray = {"Red", "Green", "Blue"};
        List<String> colors = Arrays.asList(colorsArray);

        // Modifying the list (and array)
        colors.set(0, "Yellow");

        // Accessing elements in the original array
        System.out.println(colorsArray[0]); // Output: true
        System.out.println(colorsArray[1]); // Output: true
        System.out.println(colorsArray[2]); // Output: true
    }
}
