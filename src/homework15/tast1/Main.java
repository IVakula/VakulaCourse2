package homework15.tast1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        doToList();
    }

    public static void doToList() {
        Integer[] values = {1, 2, 3, 5, 4, 6, 9, 7};
        System.out.println(toList(values));

        String[] strings = {"Hello", "world", "Yes", "No"};
        System.out.println(toList(strings));
    }

    public static <T> List<T> toList(T[] array) {
        return new ArrayList<>(List.of(array));
    }
}
