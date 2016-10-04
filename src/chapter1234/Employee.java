package chapter1234;

/**
 * Created by i on 2016/8/29.
 */
public class Employee {
    private String name;
    private int salary;

    public Employee(String n, int s) {
        name = n;
        salary = s;
    }

    public Employee(String n) {
        this(n, 0);
    }

    public Employee() {
        this("Unknown");
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}