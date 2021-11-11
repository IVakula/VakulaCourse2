package homework11.taskA1;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        doFindUnique();
    }

    public static void doFindUnique() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(121);
        list.add(101);
        list.add(100);
        list.add(132);
        list.add(1145);
        list.add(54);
        list.add(1);
        list.add(100);
        list.add(121);
        list.add(101);
        list.add(100);
        list.add(132);
        list.add(1145);
        list.add(54);
        list.add(1);
        list.add(100);
        list.add(121);
        list.add(101);
        list.add(100);
        list.add(132);
        list.add(1145);
        list.add(54);
        System.out.println(list);

        System.out.println(findUnique(list));
    }

    public static List<Integer> findUnique(List<Integer> inputList) {
        List<Integer> outputList = new ArrayList<>();
        for (Integer integer : inputList) {
            if (!outputList.contains(integer)) {
                outputList.add(integer);
            }
        }
        return outputList;
    }
}
