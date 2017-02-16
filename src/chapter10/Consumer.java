package chapter10;

import sun.misc.ThreadGroupUtils;

/**
 * Created by i on 2016/10/13.
 */
public class Consumer extends Thread {
    private SyncStack theStack;
    private int num;
    private static int counter = 1;

    public Consumer(SyncStack s) {
        theStack = s;
        num = counter++;
    }

    public void run() {
        char c;
        for (int I = 0; I < 200; I++) {
            c = theStack.pop();
            System.out.println("Consumer" + num + ":" + c);
            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }
        }
    }
}
