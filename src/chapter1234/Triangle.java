package chapter1234;

/**
 * Created by i on 2016/9/5.
 */
public class Triangle extends Shape {
    void draw() {
        System.out.println("Calling chapter1234.Triangle.draw()");
    }

    @Override
    void erase() {
        System.out.println("Calling chapter1234.Triangle.erase()");
    }
}
