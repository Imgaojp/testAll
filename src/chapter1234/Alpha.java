package chapter1234;

/**
 * Created by i on 2016/8/29.
 */
class Alpha {
    private int iamprivate;

    public Alpha(int i) {
        iamprivate = i;
    }

    boolean isEqualTo(Alpha AnotherAlpha) {
        if (this.iamprivate == AnotherAlpha.iamprivate)
            return true;
        else
            return false;
    }
}