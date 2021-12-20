package homework17;

import java.util.Arrays;

public class ValueCalculator {
    private final int arraySize = 3000000;
    private final double[] values = new double[arraySize];
    private final int halfArraySize = arraySize / 2;

    public void doCalc() {
        long start = System.currentTimeMillis();
        Arrays.fill(values, 2);

        double[] part1 = new double[halfArraySize];
        double[] part2 = new double[arraySize - halfArraySize];
        System.arraycopy(values, 0, part1, 0, part1.length);
        System.arraycopy(values, part1.length, part2, 0, part2.length);

        start(part1, part2);

        System.arraycopy(part1, 0, values, 0, part1.length);
        System.arraycopy(part2, 0, values, part1.length, part2.length);

        System.out.println("Duration: " + (System.currentTimeMillis() - start));
    }

    private void start(double[] part1, double[] part2) {
        System.out.println(Thread.currentThread().getName());

        Thread thread0 = new Thread(createNewValue(part1));
        Thread thread1 = new Thread(createNewValue(part2));

        thread0.start();
        thread1.start();

        doJoin(thread0);
        doJoin(thread1);
    }

    private void create(double[] part) {
        System.out.println("Start thread: " + Thread.currentThread().getName());
        for (int i = 0; i < part.length; i++) {
            part[i] = (float) (part[i] * Math.sin(0.2f + i / 5f) * Math.cos(0.2f + i / 5f) * Math.cos(0.4f + i / 2f));
        }
        System.out.println("Finish thread: " + Thread.currentThread().getName());
    }

    private Runnable createNewValue(double[] part) {
        return () -> create(part);
    }

    private void doJoin(Thread thread) {
        System.out.println("Start join: " + thread.getName());
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finish join: " + thread.getName());
    }
}
