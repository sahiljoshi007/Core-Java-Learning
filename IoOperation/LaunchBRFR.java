import java.io.*;
import java.lang.Exception;

public class LaunchBRFR {
    public static void main(String[] args) throws Exception
    {
        
        File dir=new File("pwjava");
        File file=new File(dir,"pw.txt");

        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);

        String line=br.readLine();
        while(line!=null)
        {
            System.out.println(line);
            line=br.readLine();
        }
    }
}
