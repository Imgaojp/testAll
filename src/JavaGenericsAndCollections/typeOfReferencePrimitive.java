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
        List<Integer> smalls = Arrays.asList(1, 2, 3);
        assert sumInteger(smalls) == sum(smalls);
        assert sumInteger(smalls) == sumInteger(smalls);
//        assert sumInteger(smalls) != sumInteger(smalls); 不成立因为cache机制。而且-ea打开assert，默认不打开。
        assert sumInteger(smalls).equals(sumInteger(smalls));
        System.out.println("OK");
    }

    static Integer sumInteger(List<Integer> ints) {
        Integer s = 0;
        for (Integer n : ints
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
