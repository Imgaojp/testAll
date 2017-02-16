package chapter10;

import java.util.regex.Matcher;

/**
 * Created by i on 2016/10/13.
 */
public class Producer implements Runnable {
    private SyncStack theStack;
    private int num;
    private static int counter = 1;

    public Producer(SyncStack s) {
        theStack = s;
        num = counter++;
    }

    public void run() {
        char c;
        for (int i = 0; i < 200; i++) {
            c = (char) (Math.random() * 26 + 'A');
            theStack.push(c);
            System.out.println("Producer" + num + ":" + c);
            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }
        }
    }
}

