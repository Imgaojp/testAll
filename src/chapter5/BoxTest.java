package chapter5;

/**
 * Created by i on 2016/9/7.
 */
public class BoxTest {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.add(new Integer(10));
        System.out.println("The first inspection:");
        integerBox.inspect("some text");

        System.out.println("The Second inspection:");
        integerBox.inspect(new Double(100.0));
    }
}
