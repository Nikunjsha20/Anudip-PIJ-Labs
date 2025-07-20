package streamapilab;

import java.util.*;

public class ConcatenateStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "is", "fun");


        String result = String.join(" ", words); // Adds space between words

        System.out.println("Concatenated String: " + result);
    }
}


