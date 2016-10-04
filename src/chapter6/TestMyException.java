package chapter6;

/**
 * Created by i on 2016/9/10.
 */
public class TestMyException {
    public static void main(String[] args) {
        UsingMyException m = new UsingMyException();
        try {
            m.f();
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            m.g();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}