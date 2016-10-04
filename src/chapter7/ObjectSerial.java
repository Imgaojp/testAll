package chapter7;

import java.io.*;

/**
 * Created by i on 2016/9/20.
 */
public class ObjectSerial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employ = new Employee(123456, "Tom", 23, 6000, "03/10/10", "intel");
        ObjectOutputStream fout1 = new ObjectOutputStream(new FileOutputStream("data1.ser"));
        fout1.writeObject(employ);
        fout1.close();
        employ = null;
        ObjectInputStream fin1 = new ObjectInputStream(new FileInputStream("data1.ser"));
        employ = (Employee) fin1.readObject();
        fin1.close();
        System.out.println(employ.toString());
    }
}
