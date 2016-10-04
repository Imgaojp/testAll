package chapter7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * Created by i on 2016/9/20.
 */
public class SerializeDate {
    Date date;

    SerializeDate() {
        date = new Date();
        try {
            FileOutputStream file = new FileOutputStream("date.ser");
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(date);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SerializeDate b = new SerializeDate();
        Date data = new Date();
        System.out.println("The saved date is : "+b.date.toString()+"\n"+data.toString());
    }
}
