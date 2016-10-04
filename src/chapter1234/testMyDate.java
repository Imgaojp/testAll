package chapter1234;

/**
 * Created by i on 2016/8/26.
 */
public class testMyDate {
    private int day,month, year;

    public testMyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String Tomorrow() {
        this.day = this.day + 1;
        return this.day + "/" + this.month + "/" + this.year;
    }

    public static void main(String args[]) {
        testMyDate d = new testMyDate(12, 4, 2009);
        System.out.println(d.Tomorrow());
    }
}