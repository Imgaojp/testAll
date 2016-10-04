package chapter1234;

/**
 * Created by i on 2016/9/5.
 */
public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Calling chapter1234.Square.draw()");
    }

    @Override
    void erase() {
        System.out.println("Calling chapter1234.Square.erase()");
    }
}
