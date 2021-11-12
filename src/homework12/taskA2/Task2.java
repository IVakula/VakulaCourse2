package homework12.taskA2;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        doAddLast();
    }

    public static void doAddLast(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("orange");
        linkedList.add("banana");

        System.out.println(linkedList);
        System.out.println("*************************");

        String string1 = "tomato";
        String string2 = "cherry";

        addLast(linkedList,string1);
        addLast(linkedList,string2);

        System.out.println(linkedList);
    }

    public static void addLast(LinkedList<String> linkedList, String string){
        linkedList.addFirst(string);
    }
}
