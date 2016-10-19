package chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by i on 2016/9/8.
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 5; i++) {
            list.add(i);
        }
        System.out.println("The original list: " + list);
        ListIterator<Integer> listIter = list.listIterator();
        listIter.add(new Integer(0));
        System.out.println("After add at beginning: " + list);
        if (listIter.hasNext()) {
            int i = listIter.nextIndex();
            listIter.next();
            listIter.set(new Integer(9));
            System.out.println("After set at " + i + ": " + list);
        }
        if (listIter.hasNext()) {
            int i = listIter.nextIndex();
            listIter.next();
            listIter.remove();
            System.out.println("After remove at " + i + ": " + list);
        }
    }
}