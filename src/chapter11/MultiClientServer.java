package chapter11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by i on 2016/10/14.
 */
public class MultiClientServer implements Runnable {
    static int SerialNum = 0;
    Socket socket;

    public MultiClientServer(Socket ss) {
        socket = ss;
    }

    public static void main(String args[]) {
        int MaxClientNum = 5;
        try {
            ServerSocket server = new ServerSocket(1680);
            for (int i = 0; i < MaxClientNum; i++) {
                Socket socket = server.accept();
                Thread t = new Thread(new MultiClientServer(socket));
                t.start();
            }
            server.close();
        } catch (Exception e) {
            System.out.println("Error :" + e);
        }
    }

    public void run() {
        int myNum = ++SerialNum;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
            String s;
            while (!(s = in.readLine()).equals("bye")) {
                System.out.println("#Received from Client NO." + myNum + ":" + s);
                out.println(sin.readLine());
                out.flush();
            }
            System.out.println("The connection to Client NO." + myNum + "is closing...");
            in.close();
            out.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("Error :" + e);
        }
    }
}
