package collectionlab;

import java.util.ArrayList;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();


        numbers.add(10);
        numbers.add(21);
        numbers.add(4);
        numbers.add(33);
        numbers.add(8);

        int sum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}
