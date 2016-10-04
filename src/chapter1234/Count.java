package chapter1234;

/**
 * Created by i on 2016/9/6.
 */
public class Count {
    private int serialNumber;
    public static int counter = 10;

    public Count() {
        counter++;
        serialNumber = counter;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
