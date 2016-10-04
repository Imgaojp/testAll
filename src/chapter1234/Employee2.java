package chapter1234;

/**
 * Created by i on 2016/9/5.
 */
class Employee2 {
    private String name;
    private int salary;

    public Employee2(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getDetails() {
        return "name : " + name + "\nsalary : " + salary;
    }
}
