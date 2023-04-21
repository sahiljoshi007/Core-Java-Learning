// package IoOperation;
import java.io.*;

public class LaunchFile1 {
    public static void main(String[] args) throws IOException
     {
        File file1=new File("pw.txt");
        System.out.println(file1.exists());//False

        file1.createNewFile();//one Physicalfile will also get created in this directory
        System.out.println(file1.exists());//True



        File dir =new File("pw");
        System.out.println(dir.exists());//False

        dir.mkdir();//directory will get created
        System.out.println(dir.exists());//True
    }
}
