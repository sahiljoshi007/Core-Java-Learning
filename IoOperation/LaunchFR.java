import java.io.*;
import java.lang.Exception;

public class LaunchFR {
    public static void main(String[] args) throws Exception
    {
        
        File dir=new File("pwjava");
        File file=new File(dir,"pw.txt");

        FileReader fr=new FileReader(file);
        // int i=fr.read();
       

        char ch[]=new char[(int)file.length()];
        fr.read(ch);

        for(char data:ch)
        {
            System.out.print(data);
        }

        // while(i!=-1)
        // {
        //     System.out.print(i+"--------> ");
        //     System.out.println((char)i);
        //     i=fr.read();
        // }

    }
}
