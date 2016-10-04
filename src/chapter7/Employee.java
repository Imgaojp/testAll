package chapter7;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by i on 2016/9/20.
 */
public class Employee implements Serializable {
    int id;
    String name;
    int age;
    int salary;
    String hireDay;
    String department;

    public Employee() {
    }

    public Employee(int id, String name, int age, int salary, String hireDay, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hireDay = hireDay;
        this.department = department;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        Date saveDate = new Date();
        out.writeInt(id);
        out.writeInt(age);
        out.writeUTF(name);
        out.writeInt(salary);
        out.writeUTF(hireDay);
        out.writeUTF(department);
        out.writeInt(saveDate.getYear());
    }
    private void readObject(ObjectInputStream in) throws IOException {
        Date readDate = new Date();
        int savedYear;
        id = in.readInt();
        age = in.readInt();
        name = in.readUTF();
        salary = in.readInt();
        hireDay = in.readUTF();
        department = in.readUTF();
        savedYear = in.readInt();
        age = age + (readDate.getYear() - savedYear);
    }

    public String toString() {
        return "id: " + id + "\n name: " + name + "\n age: " + age + "\n salary: " + salary + "\n hireDay: " + hireDay + "\n department: " + department;
    }
}
