package chapter7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by i on 2016/9/12.
 */
public class CopyBytes {
    public static void main(String[] args) throws IOException{
        File inputFile = new File("OutFile.txt");
        File outputFile = new File("output.txt");
        FileInputStream inputStream = new FileInputStream(inputFile);
        FileOutputStream outputStream = new FileOutputStream(outputFile);
        int c;
        while ((c = inputStream.read()) != -1) {
            outputStream.write(c);
            System.out.printf("%c",c);
//            System.out.println();
//            System.out.print(Integer.toBinaryString(c).toString().length());

        }
        inputStream.close();
        outputStream.close();
    }
}
