package Jvm;

/**
 * Created by i on 2016/10/18.
 */
public class JavaVMStackSOF {
    private int stackLength=1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String args[]) throws Exception {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable throwable) {
            System.out.println("Stack length: " + oom.stackLength);
            throw throwable;
        }
    }
}
