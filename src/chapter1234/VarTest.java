package chapter1234;

/**
 * Created by i on 2016/8/26.
 */
public class VarTest {
    private int x = 1;
    private int y = 1;
    private int z = 1;

    void changeVar(int a, int b, int c) {
        x = a;
        int y = b;
        int z = 9;
        System.out.println("In changeVar:" + "x= " + x + "y=" + y + "z=" + z);
        this.z = c;
    }

    String getXYZ() {
        return "x=" + x + "y=" + y + "z=" + z;
    }

    public static void main(String args[]) {
        VarTest v = new VarTest();
        System.out.println("Before changeVar:" + v.getXYZ());
        v.changeVar(10, 10, 10);
        System.out.println("After changeVar" + v.getXYZ());
    }
}
