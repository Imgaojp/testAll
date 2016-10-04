package Greek;

/**
 * Created by i on 2016/8/29.
 */
class Delta extends Alpha{
    void accessMethod(Alpha a, Delta delta) {
        a.iampackage = 10;
        delta.iampackage = 10;
        delta.packageMethod();
        a.packageMethod();
    }
}