package collectionlab;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseStringList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Adding strings to the list
        names.add("Apple");
        names.add("Banana");
        names.add("Cherry");
        names.add("Mango");

        System.out.println("Original List: " + names);

        // Reversing the list
        Collections.reverse(names);

        System.out.println("Reversed List: " + names);
    }
}

