package chapter5;

import java.util.Random;

/**
 * Created by i on 2016/9/6.
 */
public class TestShapes {
    static void drawOneShape(Shape shape) {
        shape.draw();
    }

    static void drawShapes(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shape = new Shape[9];
        for (int i = 0; i < shape.length; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    shape[i] = new Circle();
                    break;
                case 1:
                    shape[i] = new Square();
                    break;
                case 2:
                    shape[i] = new Triangle();
                    break;
            }
        }
        drawShapes(shape);
    }
}
