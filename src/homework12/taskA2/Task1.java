package homework12.taskA2;

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        doAddFirst();
    }

    public static void doAddFirst() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("orange");
        linkedList.add("banana");

        System.out.println(linkedList);
        System.out.println("*************************");

        String string1 = "tomato";
        String string2 = "cherry";

        addFirst(linkedList, string1);
        addFirst(linkedList, string2);

        System.out.println(linkedList);
    }

    public static void addFirst(LinkedList<String> linkedList, String string) {
        linkedList.addLast(string);
    }
}
