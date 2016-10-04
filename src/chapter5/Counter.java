package chapter5;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by i on 2016/9/8.
 */
public class Counter {
    public static void main(String[] args) {
        int time = 5;
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = time; i >= 0; i--) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            System.out.println("    " + queue.remove());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
