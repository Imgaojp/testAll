package chapter6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by i on 2016/9/9.
 */
public class ListOfNumbers {
    private ArrayList<Integer> list;
    private static final int size = 10;

    public ListOfNumbers() {
        list = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            list.add(new Integer(i));
        }
    }

    public void writeList() {
        PrintWriter out = null;
        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));
            for (int i = 0; i < size; i++) {
                out.println("Value at : " + i + " = " + list.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
        out.close();
    }
}
