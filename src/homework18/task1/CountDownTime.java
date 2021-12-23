package homework18.task1;


public class CountDownTime implements Runnable{
    private Thread thread;
    private int seconds;

    public CountDownTime() {
        thread = new Thread(this);
    }

    public void start(int minutes){
        seconds = minutes*60;
        thread.start();

    }

    @Override
    public void run() {
        while (seconds>0){
            try{
                Thread.sleep(1000);
                seconds--;
                System.out.printf("%1$02d:%2$02d\n",seconds/60,seconds%60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("THE END");
    }
}
