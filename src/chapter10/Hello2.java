package chapter10;

/**
 * Created by i on 2016/10/13.
 */
public class Hello2 implements Runnable {
    int i = 0;
    private boolean timeToQuit = false;

    public void run() {
        while (!timeToQuit) {
            System.out.println("Hello" + i++);
            try {
                if (i % 2 == 0) {
                    Thread.sleep(10);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void stopRunning() {
        timeToQuit = true;
    }

}
