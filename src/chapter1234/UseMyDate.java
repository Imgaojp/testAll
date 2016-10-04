package chapter1234;

/**
 * Created by i on 2016/8/26.
 */
public class UseMyDate {
    public static void main(String args[]) {
        MyDate d = new MyDate();
        if (d.setDate(22, 5, 2009) == 0) {
            System.out.println(d.getDate());
//            System.out.print(d.day);
        }
    }
}
