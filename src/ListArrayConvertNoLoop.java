import java.util.*;

public class ListArrayConvertNoLoop {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("How");
        myList.add("are");
        myList.add("you");
        myList.add("?");
        System.out.println(myList);

        //  List --> Array
        String[] result = myList.toArray(new String[0]);  //Passing new String[n] as type information, n=0 or whatever number doesn't matter
        System.out.println(Arrays.toString(result));

        //List<String> myList2 = Arrays.asList("This","is","good");
        List<String> myList2 = List.of("This","is","good"); //starting from Java 9
        // List --> Array using stream
        String[] result2 = myList2.stream().toArray(String[]::new);  // `String[]::new`, a method reference, saying `use the constructor of String[]`
        System.out.println(Arrays.toString(result2));


        // Array to List
        String[] myArray = {"It","is","Friday"};
        List<String> myList3 = Arrays.asList(myArray);
        System.out.println(myList3);

        List<String> myList4 = List.of(myArray); //Starting from Java 9
        System.out.println(myList4);
    }
}
