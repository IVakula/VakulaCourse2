package homework19.task1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ThreadSafeList<Integer> threadSafeList = new ThreadSafeList<>(new ArrayList<>());
        new Thread(doAdd(threadSafeList)).start();
        new Thread(doGet(threadSafeList)).start();
        new Thread(doRemove(threadSafeList)).start();
    }

    static Runnable doAdd(ThreadSafeList<Integer> threadSafeList) {
        return () -> {
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                int value = random.nextInt(10);
                threadSafeList.add(value);
                System.out.println("Wrote value: " + value);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    static Runnable doRemove(ThreadSafeList<Integer> threadSafeList) {
        return () -> {
            Random random = new Random();
            for (int i = 0; i < 15; i++) {
                try {
                    int index = random.nextInt(4);
                    threadSafeList.remove(index);
                    System.out.println("Removed value at index: " + index);
                    Thread.sleep(random.nextInt(1000, 2500));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Index does not exist");
                }
            }
        };
    }

    static Runnable doGet(ThreadSafeList<Integer> threadSafeList) {
        return () -> {
            Random random = new Random();
            for (int i = 0; i < 15; i++) {
                try {
                    int index = random.nextInt(5);
                    int value = threadSafeList.get(index);
                    System.out.println("Value at index [" + index + "]: " + value);
                    Thread.sleep(random.nextInt(600, 1500));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Index does not exist");
                }
            }
        };
    }
}
