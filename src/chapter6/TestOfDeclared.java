package chapter6;

/**
 * Created by i on 2016/9/9.
 */
public class TestOfDeclared {
    public static void main(String[] args) {
        String res = new String();
        res =res+ "asdf"+res.length();
        System.out.println(res);
        try {
            ListOfNumbersDeclared list = new ListOfNumbersDeclared();
            list.writeList();
        } catch (Exception e) {
        }
        System.out.println("A list of numbers is created and stored in OutFile.txt");
    }
}
