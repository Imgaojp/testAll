package chapter7;

import java.io.RandomAccessFile;

/**
 * Created by i on 2016/9/20.
 */
public class RandomAcessTest {
    public static void main(String[] args) throws Exception {
        long filePoint = 0;
        String s;
        RandomAccessFile file = new RandomAccessFile("output.txt", "r");
        long fileLength = file.length();
        while (filePoint < fileLength) {
            s = file.readLine();
            System.out.println(s);
            filePoint = file.getFilePointer();
        }
        file.close();
    }
}
