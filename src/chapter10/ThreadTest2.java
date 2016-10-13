package chapter10;

/**
 * Created by i on 2016/10/12.
 */
public class ThreadTest2 {
    public static void main(String args[]) {
        Hello h1 = new Hello();
        Hello h2 = new Hello();
        h1.start();
        h2.start();
    }
}
