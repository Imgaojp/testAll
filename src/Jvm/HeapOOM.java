package Jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by i on 2016/10/18.
 */
public class HeapOOM {
    static class OOMObject {

    }

    public static void main(String args[])  throws Exception{
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
//            Thread.sleep(1000);
            list.add(new OOMObject());
        }
    }
}
