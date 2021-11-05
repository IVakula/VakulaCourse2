package homework11.taskA1;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        doCountOccurrence();
    }

    public static void doCountOccurrence() {
        List<String> list = List.of("hello", "123", "cat", "rat ", "dog", "hello", "123",
                "cat", "dog", "dog", "hello", "123", "cat", "dog", "dog", "hello", "123", "cat", "dog", "dog");

        String string1 = "dog";
        String string2 = "rat";
        String string3 = "say";

        System.out.println(string1 + ": " + countOccurrence(list, string1));
        System.out.println(string2 + ": " + countOccurrence(list, string2));
        System.out.println(string3 + ": " + countOccurrence(list, string3));
    }

    public static int countOccurrence(List<String> list, String string) {
        int count = 0;
        for (String s : list) {
            if (s.contains(string)) {
                count++;
            }
        }
        return count;
    }

}
