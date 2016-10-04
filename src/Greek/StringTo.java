package Greek;

import java.util.StringTokenizer;

/**
 * Created by i on 2016/9/3.
 */
public class StringTo {
    public static void main(String[] args) {
        String text = "  We are students  ";
        System.out.println("Raw string is : ");
        System.out.println(text);
        StringTokenizer st = new StringTokenizer(text, " ");
        StringBuffer sb = new StringBuffer();
        int i = 1;
        while (st.hasMoreTokens()) {
            i++;
            sb.append(st.nextToken());
        }
        System.out.println("Changed string is : ");
        System.out.println(sb.toString());
    }
}
