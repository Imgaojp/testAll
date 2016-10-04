package chapter1234;

/**
 * Created by i on 2016/9/6.
 */
public class StaticIntDemo {
    static int i;
    static {
        i = 5;
        System.out.println("Static code: i = " + i++);
    }
}
