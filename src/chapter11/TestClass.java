package chapter11;

/**
 * Created by i on 2016/10/18.
 */
public class TestClass {
    private static void testMethod(){
        System.out.println("testMethod");
    }
    public static void main(String[] args) {
        ((TestClass)null).testMethod();
    }
}
