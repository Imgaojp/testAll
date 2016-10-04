package chapter1234;

/**
 * Created by i on 2016/9/5.
 */
public class TestSuperManager {
    public static void main(String[] args) {
        Manager manager = new Manager("Tom", 22, "Finance");
        System.out.println(manager.getDetails());
    }
}