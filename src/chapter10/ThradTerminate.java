package chapter10;

/**
 * Created by i on 2016/10/13.
 */
public class ThradTerminate {
    public static void main(String args[]) throws Exception {
        int i = 0;
        Hello2 h = new Hello2();
        Thread t = new Thread(h);
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        System.out.println("Please stop saying hello and say good morning");
        h.stopRunning();
        while (i < 5) {
            System.out.println("Good morning " + i++);
        }
    }
}
