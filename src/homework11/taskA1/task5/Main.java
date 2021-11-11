package homework11.taskA1.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
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

        List<Enrty> resultList = calcOccurrence(stringList);

        System.out.println(resultList.stream().map(Enrty::toString)
                .collect(Collectors.joining(",\n", "[\n", "\n]")));
    }

    private static List<Enrty> calcOccurrence(List<String> stringList) {

        List<Enrty> resultList = new ArrayList<>();
        List<String> stringUniqueList = new ArrayList<>();

        for (String s : stringList) {
            if (!stringUniqueList.contains(s)) {
                stringUniqueList.add(s);
                resultList.add(new Enrty(s, Collections.frequency(stringList, s)));
            }
        }
        return resultList;
    }
}
