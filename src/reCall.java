/**
 * Created by Imgaojp on 2016/10/19.
 */
public class reCall {
    public reCall() {

    }

    public static void main(String args[]) throws  Exception {
        reCall a = new reCall();
        String str[] = {"asdf", "asdf"};
        Thread.sleep(1);
        a.main(str);
        main(str);
    }
}
