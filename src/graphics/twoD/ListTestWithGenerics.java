package graphics.twoD;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by i on 2016/9/7.
 */
public class ListTestWithGenerics {
    public static void main(String[] args) {
        List<Integer> listofInteger = new LinkedList<Integer>();
        listofInteger.add(new Integer(2000));
        listofInteger.add(28);
        Integer x = listofInteger.get(0);
        System.out.println(x);
        x = listofInteger.get(1);
        System.out.println(x);
    }
}
