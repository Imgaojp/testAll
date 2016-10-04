package chapter7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

/**
 * Created by i on 2016/9/20.
 */
public class UnSerializeDate {
    Date date = null;

    UnSerializeDate() {
        try {
            FileInputStream file = new FileInputStream("date.ser");
            ObjectInputStream stream = new ObjectInputStream(file);
            this.date = (Date) stream.readObject();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UnSerializeDate date = new UnSerializeDate();
        System.out.println("The date read is : "+date.date.toString());
    }
}
