package chapter5;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by i on 2016/9/8.
 */
public class Freq {
    public static void main(String[] args) {
        String[] words = {"if", "it", "is", "to", "be", "it", "is", "up", "to", "me", "to", "delegate"};
        Integer freq;
        Map<String, Integer> m = new TreeMap<String, Integer>();
        System.out.println(m);
        for (String a : words
                ) {
            freq = m.get(a);
            System.out.println(m+" "+freq);
            if (freq == null) {
                freq = new Integer(1);
            } else {
                freq = new Integer(freq.intValue() + 1);
            }
            m.put(a, freq);
            System.out.println(m);
        }
        System.out.println(m.size() + " distinct words detected");
        System.out.println(m);
    }
}
