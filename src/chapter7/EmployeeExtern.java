package chapter7;

/**
 * Created by i on 2016/9/21.
 */
public class EmployeeExtern {
    int id;
    String name;
    int age;
    int salary;
    String hireDay;
    String department;

    public EmployeeExtern() {

    }
    EmployeeExtern(int id,String name,int age,int salary,String hireDay,String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hireDay = hireDay;
        this.department = department;
    }

    public String toString() {
        return " id: " + id + "\n name: " + name + "\n age: " + age + "\n salary: " + salary + "\n hireDay: " + hireDay + "\n department: " + department;
    }
}
