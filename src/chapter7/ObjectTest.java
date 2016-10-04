package chapter7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by i on 2016/9/21.
 */
public class ObjectTest {
    public static void main(String[] args) {
        ManagerExtern manager = new ManagerExtern(456789, "Jack", 140, 10000, "80/10/10", "intel", "teamleader");
        try {
            ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream("data2.ser"));
//            fout.writeObject(manager);
            manager.writeExternal(fout);
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        manager = null;
        try {
            ObjectInputStream fin = new ObjectInputStream(new FileInputStream("data2.ser"));
//            manager = (ManagerExtern) fin.readObject();
            manager=new ManagerExtern();
            manager.readExternal(fin);
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("manager "+manager.toString());
    }
}
