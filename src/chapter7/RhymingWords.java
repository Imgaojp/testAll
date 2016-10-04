package chapter7;

import java.io.*;

/**
 * Created by i on 2016/9/12.
 */
public class RhymingWords {
    public static void main(String[] args) throws IOException {
        FileReader words = new FileReader("words.txt");
        Reader rhymeWords = reverse(sort(reverse(words)));
        BufferedReader in = new BufferedReader(rhymeWords);
        String input;
        while ((input = in.readLine()) != null) {
            System.out.println(input);
        }
        in.close();
    }
    public static Reader reverse(Reader source) throws IOException {
        BufferedReader in = new BufferedReader(source);
        PipedWriter pipeOut = new PipedWriter();
        PipedReader pipedIn = new PipedReader(pipeOut);
        PrintWriter out = new PrintWriter(pipeOut);
        new ReverseThread(out, in).start();
        return pipedIn;
    }
    public static Reader sort(Reader source)throws IOException {
        BufferedReader in = new BufferedReader(source);
        PipedWriter pipeOut = new PipedWriter();
        PipedReader pipeIn = new PipedReader(pipeOut);
        PrintWriter out = new PrintWriter(pipeOut);
        new SortThread(out, in).start();
        return pipeIn;
    }
}
