package xyz;

import java.util.*;

public class NestedSet {
    public static void main(String[] args) {
        List<Set<Integer>> listOfSets = new ArrayList<>();
        for (int i = 0; i < 5; i++) {  // Предположим, что мы хотим добавить 5 Set
            Set<Integer> set = new HashSet<>();
            set.add(3);
            set.add(2);
            set.add(1);
            listOfSets.add(set);
        }
        for (Set<Integer> set : listOfSets) {
            System.out.println(set);
        }
    }
}
