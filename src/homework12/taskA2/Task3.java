package homework12.taskA2;

import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        doJoin();
    }

    public static void doJoin() {
        LinkedList<Integer> param1 = new LinkedList<>();
        param1.add(1);
        param1.add(2);
        param1.add(3);
        param1.add(4);
        param1.add(5);
        param1.add(6);

        System.out.println("param1 " + param1);

        LinkedList<Integer> param2 = new LinkedList<>();
        param2.add(7);
        param2.add(8);
        param2.add(9);
        param2.add(10);
        param2.add(11);
        param2.add(12);

        System.out.println("param2 " + param2);

        System.out.println("result " + join(param1, param2));
    }

    public static LinkedList<Integer> join(LinkedList<Integer> param1, LinkedList<Integer> param2) {
        LinkedList<Integer> result = new LinkedList<>();

        result.addAll(param1);
        result.addAll(param2);

        return result;
    }
}
