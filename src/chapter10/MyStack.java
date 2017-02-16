package chapter10;

/**
 * Created by i on 2016/10/13.
 */
public class MyStack {
    private int idx = 0;
    private char[] data = new char[6];

    public void push(char c) {
        data[idx] = c;
        idx++;
    }

    public char pop() {
        idx--;
        return data[idx];
    }

    public int getIdx() {
        return idx;
    }
}
