package homework11.taskA1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        doCalcOccurrence();
    }

    private static void doCalcOccurrence() {
        List<String> stringList = new ArrayList<>();
        stringList.add("dog");
        stringList.add("bird");
        stringList.add("cat");
        stringList.add("rat");
        stringList.add("dog");
        stringList.add("bird");
        stringList.add("pig");
        stringList.add("rat");
        stringList.add("dog");
        stringList.add(" ");
        stringList.add("cat");
        stringList.add("dog");
        stringList.add("bird");
        stringList.add("cat");

        calcOccurrence(stringList);
    }

    private static void calcOccurrence(List<String> stringList) {

        List<String> stringUniqueList = new ArrayList<>();
        for (String s : stringList) {
            if (!stringUniqueList.contains(s)) {
                stringUniqueList.add(s);
                System.out.printf("\"%s\": %-2d %n", s, Collections.frequency(stringList, s));
            }
        }
    }
}
