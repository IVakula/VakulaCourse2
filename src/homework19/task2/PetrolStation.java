package homework19.task2;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.DoubleAdder;

public class PetrolStation {
    private final DoubleAdder amount;
    private final AtomicInteger carNumber = new AtomicInteger();
    private final ExecutorService executorService = Executors.newFixedThreadPool(3);

    public PetrolStation(double amount) {
        this.amount = new DoubleAdder();
        this.amount.add(amount);
    }

    public void doRefuel(double needAmount) {
        executorService.submit(() -> {
            int number = carNumber.incrementAndGet();
            System.out.println("Car " + number + " began to refuel.");
            if (amount.doubleValue() < needAmount) {
                System.out.println("Not enough petrol for car " + number);
            } else {
                PetrolStation.doSleep(3000, 10000);
                amount.add(-needAmount);
                System.out.printf("Car %1$d refueled successfully for %2$.2fl!\n", number, needAmount);
            }
        });
    }


    static void doSleep(int a, int b) {
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(a, b));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void shutdown() {
        executorService.shutdown();
    }

}
