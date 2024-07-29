package xyz;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDifference {
    public static void main(String[] args) {
        // HashSet не гарантирует порядок
        // Порядок может меняться, зависит от хэш-кодов и внутренней структуры
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet сохраняет порядок вставки
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet сортирует элементы
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println("TreeSet: " + treeSet);
    }
}
