package JavaGenericsAndCollections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Imgaojp on 2016/10/20.
 */
public class subTypeTest {
    public static void main(String args[]) throws Exception{
        List ints = new ArrayList() ;
        ints.add(1);
        ints.add(3);
//        List nums = ints;
//        nums.add(2.3);
//        System.out.println(nums);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String sin = in.readLine();
        ints.add(sin);
        System.out.println(ints);
        List<Integer> collection = ints;
        System.out.println(collection);
    }
}