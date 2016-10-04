package chapter1234;

/**
 * Created by i on 2016/9/6.
 */
public class UseGeneral {
    public static void main(String[] args) {
//        int c = chapter1234.GeneralFunction.add(4, 5);
        GeneralFunction generalFunction = new GeneralFunction();
        int c = generalFunction.add(4, 5);
        System.out.println("4+5="+ c);
    }
}
