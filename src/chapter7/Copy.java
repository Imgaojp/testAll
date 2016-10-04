package chapter7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by i on 2016/9/12.
 */
public class Copy {
    public static void main(String[] args) throws IOException{
        FileReader fileReader = new FileReader("OutFile.txt");
        FileWriter fileWriter = new FileWriter("output_reader.txt");
        int c;
        while ((c = fileReader.read()) != -1) {
            fileWriter.write(c);
            System.out.printf("%c",c);
//            System.out.print(Integer.toBinaryString(c).toString().length());
//            System.out.println();
        }
        fileReader.close();
        fileWriter.close();
    }
}
