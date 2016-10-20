package JavaGenericsAndCollections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Imgaojp on 2016/10/20.
 */
public class varArgs {
    public static void main(String args[]) {
        List<Integer> ints = listsTest.toList(new Integer[]{1, 2, 6, 6, 9, 8});
//        List<Integer> ints1 = listsTest.toList(1, 2, 6, 6, 9, 8); varargs
        System.out.println(ints);
    }
}
