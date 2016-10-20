package JavaGenericsAndCollections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Imgaojp on 2016/10/20.
 */
public class dotProduct {
    public static void main(String args[]) {
        List<Double> u = Arrays.asList(2.3, 1.5, 6.9, 2.5);
        List<Double> v = Arrays.asList(2.3, 1.5, 6.9, 2.5);
        System.out.println(dot(u, v));
    }

    static double dot(List<Double> u, List<Double> v) {
        if (u.size() != v.size()) {
            throw new IllegalArgumentException("different sizes");
        }
        double d = 0;
        Iterator<Double> uIt = u.iterator();
        Iterator<Double> vIt = v.iterator();
        while (uIt.hasNext()) {
            assert uIt.hasNext() && vIt.hasNext();
            d += uIt.next() * vIt.next();
        }
        assert !uIt.hasNext() && !vIt.hasNext();
        return d;
    }
}
