package graphics.twoD;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by i on 2016/9/7.
 */
public class TestPackage {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        Rectangle rectangle = new Rectangle(point, 10, 10);
        System.out.println("The area of the rectangle is " + rectangle.area());
    }
}
