package homework19.task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        runPetrolStation();
    }

    static void runPetrolStation() throws InterruptedException {
        PetrolStation petrolStation = new PetrolStation(1205);
        Random random = new Random();
        for (int i = 1; i < 12; i++) {
            petrolStation.doRefuel(random.nextDouble() * 1000);
            System.out.println("Add car " + i + " to queue");
            Thread.sleep(1000);
        }
        petrolStation.shutdown();
    }


}
