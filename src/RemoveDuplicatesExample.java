import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesExample {
    public static void main(String[] args) {
        // Create an ArrayList with duplicates
        List<String> originalList = new ArrayList<>();
        originalList.add("apple");
        originalList.add("banana");
        originalList.add("orange");
        originalList.add("apple");
        originalList.add("banana");

        // Remove duplicates by converting to HashSet and back to ArrayList
        List<String> deduplicatedList = new ArrayList<>(new HashSet<>(originalList));

        // Print the original and deduplicated lists
        System.out.println("Original List: " + originalList);
        System.out.println("Deduplicated List: " + deduplicatedList);
    }
}
