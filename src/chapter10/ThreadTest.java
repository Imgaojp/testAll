package chapter10;

/**
 * Created by i on 2016/10/12.
 */
public class ThreadTest {
    public static void main(String args[]) {
        Thread t1 = new Thread(new Hello());
        Thread t2 = new Thread(new Hello());
        t1.start();
        t2.start();
    }

}
