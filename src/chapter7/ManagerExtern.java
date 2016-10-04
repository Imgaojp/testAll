package chapter7;

import java.io.*;
import java.util.Date;

/**
 * Created by i on 2016/9/21.
 */
public class ManagerExtern extends EmployeeExtern implements Externalizable {
    String position;

    public ManagerExtern() {

    }

    ManagerExtern(int id, String name, int age, int salary, String hireDay, String department, String position) {
        super(id, name, age, salary, hireDay, department);
        this.position = position;
    }
    public void writeExternal(ObjectOutput out)throws IOException {
        Date saveDate = new Date();
        out.writeInt(id);
        out.writeInt(age);
        out.writeObject(name);
        out.writeInt(salary);
        out.writeObject(hireDay);
        out.writeObject(department);
        out.writeObject(position);
        out.writeInt(saveDate.getYear());
    }
    public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException {
        Date readDate = new Date();
        int savedYear;
        id = in.readInt();
        age = in.readInt();
        name = (String) in.readObject();
        salary = in.readInt();
        hireDay = (String) in.readObject();
        department = (String) in.readObject();
        position = (String) in.readObject();
        savedYear = in.readInt();
        age = age + (readDate.getYear() - savedYear);
    }

    public String toString() {
        return super.toString() + "\n position: " + position;
    }
}
