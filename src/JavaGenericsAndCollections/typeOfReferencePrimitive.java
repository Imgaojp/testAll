package JavaGenericsAndCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by i on 2016/10/19.
 */
public class typeOfReferencePrimitive {
    public static void main(String args[]) {
        List<Integer> bigs = Arrays.asList(100, 200, 300);
        assert sumInteger(bigs) == sum(bigs);
        assert sumInteger(bigs) != sumInteger(bigs);
        assert sumInteger(bigs).equals(sumInteger(bigs));
        System.out.println("OK");
    }

    static Integer sumInteger(List<Integer> ints) {
        Integer s = 0;
        for (Integer n:ints
             ) {
            s += n;
        }
        return s;
    }

    static int sum(List<Integer> ints) {
        int s = 0;
        for (int n : ints
                ) {
            s += n;
        }
        return s;
    }
}
