package chapter6;

/**
 * Created by i on 2016/9/10.
 */
public class MyException extends Exception {
    MyException() {}

    MyException(String msg) {
        super(msg);
    }
}
