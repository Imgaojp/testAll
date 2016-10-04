package chapter5;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by i on 2016/9/8.
 */
public class FindDups {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        for (String a:args
             ) {
            if (!s.add(a)) {
                System.out.println("Duplicate detected: " + a);
            }
        }
        System.out.println(s.size() + " distinct words detected :" + s);
    }
}
