package JavaGenericsAndCollections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Imgaojp on 2016/10/20.
 */
public class listsTest {
        public static <T> List<T> toList(T[] arr) {
//        public static <T> List<T> toList(T... arr) {  //varargs
            List<T> lists = new ArrayList<T>();
            for (T elt:arr
                    ) {
                lists.add(elt);
            }
            String A="asdfasdd";
            A=A+"asdf";
            System.out.println(A);
            int b=4;
            return lists;
        }
}
