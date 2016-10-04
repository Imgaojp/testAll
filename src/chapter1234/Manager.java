package chapter1234;

/**
 * Created by i on 2016/9/5.
 */
class Manager extends Employee2 {
    private String department;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }
    public String getDetails() {
        return super.getDetails() + "\nDepartment : " + department;
    }
}
