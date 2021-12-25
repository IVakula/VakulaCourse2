package homework18.task2;

public class CountDownTime2 implements Runnable {
    private Thread thread;
    private int seconds;

    public CountDownTime2() {
        thread = new Thread(this);
    }

    public void start(int hours, int minutes, int seconds) {
        this.seconds = hours * 3600 + minutes * 60 + seconds;
        thread.start();

    }

    @Override
    public void run() {
        while (seconds > 0) {
            try {
                Thread.sleep(1000);
                seconds--;
                int remainder = seconds % 3600;
                System.out.printf("%1$02d:%2$02d:%3$02d\n", seconds / 3600, remainder / 60, remainder % 60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("THE END");
    }
}
