package chapter10;

/**
 * Created by i on 2016/10/13.
 */
public class A extends Thread {
    MyStack stack;
    char c;

    public A(MyStack stack) {
        this.stack = stack;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            if (stack.getIdx() < 5) {
                c = (char) (Math.random() * 26 + 'A');
                stack.push(c);
                System.out.println("A:push" + c);
            }
        }
    }
}
