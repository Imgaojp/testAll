package chapter1234;

/**
 * Created by i on 2016/9/6.
 */
public class TestCount {
    public static void main(String[] args) {
        Count[] counts = new Count[10];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = new Count();
            System.out.println("counts["+i+"].serialNumber = "+counts[i].getSerialNumber());
        }
    }
}
