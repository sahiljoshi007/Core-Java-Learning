// package IoOperation;
import java.io.*;
public class LaunchFile2 {
    public static void main(String[] args) throws IOException
     {
        
        // File dir=new File("pwjava");
        // dir.mkdir();
        // System.out.println(dir.isDirectory());


        // File file=new File(dir,"sj.txt");
        // file.createNewFile();
        // System.out.println(file.isFile());


        int count=0;

        File f=new File("pwjava");
        String str[]=f.list();

        for(String name:str)
        {
            count++;
            System.out.println(name);
        }
        System.out.println("Number of files are "+count);
    }
}
