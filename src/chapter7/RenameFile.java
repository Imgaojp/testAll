package chapter7;

import java.io.File;
import java.util.Date;

/**
 * Created by i on 2016/9/20.
 */
public class RenameFile {
    private static void fileData(File file) {
        System.out.println("Absolute path : " + file.getAbsolutePath() +
                "\n Can read : " + file.canRead() +
                "\n Can write : " + file.canWrite() +
                "\n getName : " + file.getName() +
                "\n getParent : " + file.getParent() +
                "\n getPath : " + file.getPath() +
                "\n length : " + file.length() +
                "\n lastModified : " + new Date(file.lastModified()));
        if (file.isFile()) {
            System.out.println("It's a file");
        } else if(file.isDirectory()){
            System.out.println("It's a directory");
        }
    }

    public static void main(String[] args) {
        File old = new File(args[0]);
        File rname = new File(args[1]);
        System.out.println("The original file's information:");
        fileData(old);
        old.renameTo(rname);
        System.out.println("\n The file information after rename : ");
        fileData(rname);
        if (!old.exists()) {
            System.out.println("\n The original file never exists.");
        }
    }
}
