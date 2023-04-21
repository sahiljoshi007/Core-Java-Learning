import java.io.FileWriter;
import java.lang.Exception;

import java.io.*;

public class LaunchPW {
    public static void main(String[] args) throws Exception{
        
        File dir=new File("pwjava");
        File file=new File(dir, "sj.txt");

        FileWriter fw=new FileWriter(file);
        PrintWriter pw=new PrintWriter(file);

        pw.write(97);
        pw.write("\n");

        pw.println("java");
        pw.println(97);
        pw.println('a');
        pw.println(50.5);
        pw.println(true);

        pw.close();
    }
}
