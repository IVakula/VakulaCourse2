package homework12.taskA2;

import java.util.Collections;
import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {
        doShuffle();
    }

    public static void doShuffle() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("d");
        linkedList.add("e");
        linkedList.add("f");
        linkedList.add("g");
        linkedList.add("i");
        linkedList.add("k");
        linkedList.add("l");
        linkedList.add("m");
        linkedList.add("n");
        linkedList.add("o");

        System.out.println(linkedList);
        System.out.println("*************************************");

        System.out.println(shuffle(linkedList));
        System.out.println(shuffle(linkedList));
    }

    public static LinkedList<String> shuffle(LinkedList<String> linkedList) {

        Collections.shuffle(linkedList);

        return linkedList;
    }
}
