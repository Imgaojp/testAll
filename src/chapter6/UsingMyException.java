package chapter6;

/**
 * Created by i on 2016/9/10.
 */
public class UsingMyException {
    void f() throws MyException {
        System.out.println("Throws MyException from f()");
        throw new MyException();
    }

    void g() throws MyException {
        System.out.println("Throws MyException from g()");
        throw new MyException("Originated in g()");
    }
}
