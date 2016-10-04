package chapter1234;

/**
 * Created by i on 2016/9/5.
 */
public class Outer2 {
    private int size = 5;

    public Object makeInner(final int finalLocalvar) {
        int LocalVar = 6;
        class Inner {
            public String toString() {
                return ("#<Inner size = " + size + "localvar = " + LocalVar + "finalLocalVar = " + finalLocalvar + ">");
            }
        }
        return new Inner();
    }

    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        Object object = outer2.makeInner(40);
        System.out.println("The object is "+object.toString());
    }
 }
