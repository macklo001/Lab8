package pl.edu.utp.programowanie2.lab_08.numbers;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> numbers = new ArrayList<>();
        Map<Integer, Integer> numbersCounts = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            Integer r = random.nextInt(50);
            numbers.add(r);

            if (! numbersCounts.containsKey(r)) {
                numbersCounts.put(r,1);
            } else {
                numbersCounts.put(r, numbersCounts.get(r) + 1);
            }
        }

        System.out.println("ALL");
        System.out.println(numbers);

        System.out.println("UNIQUE");

        List<Integer> unique = new ArrayList<>();
        for (Integer key: numbersCounts.keySet()) {
            if (numbersCounts.get(key).equals(1)){
                unique.add(key);
            }
        }
        System.out.println(unique);

        System.out.println("REPEATED");
        List<Integer> repeated = new ArrayList<>();
        for (Integer key: numbersCounts.keySet()) {
            if (numbersCounts.get(key) > 1){
                repeated.add(key);
            }
        }
        System.out.println(repeated);

    }
}
