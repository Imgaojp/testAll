package chapter10;

/**
 * Created by i on 2016/10/12.
 */
//public class Hello implements Runnable {
public class Hello extends Thread{
    int i;

    public void run() {
        while (true) {
            System.out.println("Hello " + i++);
            if (i == 10) {
                break;
            }
        }
    }
}
