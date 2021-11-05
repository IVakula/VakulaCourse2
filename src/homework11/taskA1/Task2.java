package homework11.taskA1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        doToList();
    }

    public static void doToList() {
        int[] array = {1, 2, -103, 165, 4, 520, 7, 1114, 5, 102};

        List<Integer> list = toList(array);

        System.out.println(list);
    }

    public static List<Integer> toList(int[] array) {
        return Arrays.stream(array).boxed().collect(Collectors.toList());
    }
}
