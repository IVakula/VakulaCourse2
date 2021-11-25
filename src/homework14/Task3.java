package homework14;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        doGetSortedUniqueIntegersDESC();
    }

    public static void doGetSortedUniqueIntegersDESC() {
        List<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(123);
        values.add(15);
        values.add(16);
        values.add(1);
        values.add(10);
        values.add(null);
        values.add(13);
        values.add(15);
        values.add(145);
        values.add(13);
        values.add(null);
        System.out.println("Source list: " + values);
        System.out.println("Result: " + getSortedUniqueIntegersDESC(values));
    }

    public static Set<Integer> getSortedUniqueIntegersDESC(List<Integer> values) {
        Set<Integer> sortedIntegers = new TreeSet<>(Comparator.nullsLast(Comparator.reverseOrder()));
        sortedIntegers.addAll(values);
        return sortedIntegers;
    }
}
