package chapter6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

/**
 * Created by i on 2016/9/9.
 */
public class ListOfNumbersDeclared {
    private Vector<Integer> victor;
    private static final int size = 10;

    public ListOfNumbersDeclared() {
        victor = new Vector<Integer>(size);
        for (int i = 0; i < size; i++) {
            victor.addElement(new Integer(i));
        }
    }

    public void writeList() throws IOException, IndexOutOfBoundsException {
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
        for (int i = 0; i < size; i++) {
            out.println("Value at: "+" = "+victor.elementAt(i));
        }
        out.close();
    }
}
