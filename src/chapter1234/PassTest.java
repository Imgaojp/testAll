package chapter1234;

/**
 * Created by i on 2016/8/26.
 */
public class PassTest {
    float ptValue;

    public void changeInt(int value) {
        value = 55;
    }

    public void changeStr(String value) {
        value = new String("different");
    }

    public void changeObjectValue(PassTest ref) {
        ref.ptValue = 99.0f;
    }

    public static void main(String args[]) {
        String str;
        int val;
        PassTest pt = new PassTest();
        val = 11;
        pt.changeInt(val);
        System.out.println("Int value is : " + val);

        str = new String("hello");
        pt.changeStr(str);
        System.out.println("Str value is : " + str);

        pt.ptValue = 101.0f;
        pt.changeObjectValue(pt);
        System.out.println("Pt value is : " + pt.ptValue);
    }
}
