package chapter1234;

import java.util.Random;

/**
 * Created by i on 2016/9/5.
 */
public class Shapes {
    static void drawOneShape(Shape s) {
        s.draw();
    }

    static void eraseOneShape(Shape shape) {
        shape.erase();
    }

    static void drawShapes(Shape[] ss) {
        for (int i = 0; i < ss.length; i++) {
            ss[i].draw();
        }
    }
    public static void main(String[] args) {
        Random rand = new Random();
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            switch (rand.nextInt(3)) {
                case 0:s[i]=new Circle();break;
                case 1:s[i]=new Square();break;
                case 2:s[i]=new Triangle();break;
            }
        }
        drawShapes(s);
    }
}
