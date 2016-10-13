package chapter10;

/**
 * Created by i on 2016/10/13.
 */
public class ThreadJoinTest {
    public static void main(String args[]) throws Exception {
        int i = 0;
        Hello t = new Hello();
        t.start();
        while (true) {
            System.out.println("Good morning" + i++);
            if (i == 2 && t.isAlive()) {
                System.out.println("Main waiting for Hello");
                t.join();
            }
            if (i == 5) {
                break;
            }
        }
    }
}
