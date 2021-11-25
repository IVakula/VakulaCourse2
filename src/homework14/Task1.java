package homework14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        doConvertToUnique();
    }

    public static void doConvertToUnique() {
        List<String> values = new ArrayList<>();
        values.add("Привет");
        values.add("Мир");
        values.add("!");
        values.add("Привет");
        values.add("Добрый");
        values.add("День");
        values.add(null);
        values.add("Привет");
        values.add("!");
        values.add("Добрый");
        values.add("Добрый");
        values.add(null);
        System.out.println("Source list: " + values);
        System.out.println("Result: " + convertToUnique(values));
    }

    public static Set<String> convertToUnique(List<String> sequenceOfLines) {
        return new HashSet<>(sequenceOfLines);
    }
}
