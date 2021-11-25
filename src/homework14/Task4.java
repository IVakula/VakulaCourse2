package homework14;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        doBuildSentenceDirection();
    }

    public static void doBuildSentenceDirection() {
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
        System.out.println("Result: " + buildSentenceDirection(values));
    }

    public static Set<String> buildSentenceDirection(List<String> sequenceOfLine) {
        return new LinkedHashSet<>(sequenceOfLine);
    }
}
