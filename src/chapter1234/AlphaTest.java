package chapter1234;

/**
 * Created by i on 2016/8/29.
 */
public class AlphaTest {
    public static void main(String args[]) {
        Alpha aa = new Alpha(10);
        Alpha bb = new Alpha(12);
        if (aa.isEqualTo(bb)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
