package chapter1234;

/**
 * Created by i on 2016/8/26.
 */
class MyDate {
    private int day;
    private int month;
    private int year;

    public String getDate() {
        return day + "/" + month + "/" + year;
    }

    public int setDate(int a, int b, int c) {
        if ((a > 0 && a <= 31) && (b > 0 && b <= 12)) {
            day = a;
            month = b;
            year = c;
            return 0;
        } else {
            return -1;
        }
    }
}