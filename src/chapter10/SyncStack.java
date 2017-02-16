package chapter10;

import java.util.Vector;

/**
 * Created by i on 2016/10/13.
 */
public class SyncStack {
    private Vector<Character> buffer = new Vector<Character>(400, 200);

    public synchronized char pop() {
        char c;
        while (buffer.size() == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {

            }
        }
        c = ((Character) buffer.remove(buffer.size() - 1)).charValue();
        return c;
    }

    public synchronized void push(char c) {
        this.notify();
        Character charObj = new Character(c);
        buffer.addElement(charObj);
    }
}
