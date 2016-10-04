package chapter1234;

/**
 * Created by i on 2016/9/6.
 */
public class Customer {
    private final long customerID;
    private static long counter = 200901;

    public Customer() {
        customerID = counter++;
    }

    public long getID() {
        return customerID;
    }

    public static void main(String[] args) {
        Customer[] customer = new Customer[5];
        for (int i = 0; i < customer.length; i++) {
            customer[i] = new Customer();
            System.out.println("The customer ID is " + customer[i].getID());
        }
    }
}
