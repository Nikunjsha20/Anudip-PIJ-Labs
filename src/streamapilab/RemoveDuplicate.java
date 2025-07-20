package streamapilab;
import java.util.*;


public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

        List<String> uniqueNames = names.stream().distinct().toList();

        System.out.println("Original List: " + names);
        System.out.println("List after removing duplicates: " + uniqueNames);
    }
}
