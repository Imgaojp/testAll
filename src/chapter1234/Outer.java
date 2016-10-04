package chapter1234;

/**
 * Created by i on 2016/9/5.
 */
public class Outer {
    private int size = 4;

    public class Inner {
        private int size = 15;

        public void doStuff(int size) {
            size++;
            this.size++;
            Outer.this.size++;
            System.out.println(size);
            System.out.println(this.size);
            System.out.println(Outer.this.size);
        }
    }

    Inner inner = new Inner();

    public void increaseSize(int s) {
        inner.doStuff(s);
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.increaseSize(10);
    }
}