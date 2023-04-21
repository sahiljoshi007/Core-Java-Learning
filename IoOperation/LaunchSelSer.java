//Topic---> (Transient) selective serialization 
import java.io.*;
import java.lang.Exception;

import javax.xml.transform.Source;            

class Cricketer implements Serializable
{
    private String name;
    transient int age;     //transient member will not participate in serialization
    private int runs;


    public Cricketer(String name,int age,int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;
    }

    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}


public class LaunchSelSer {
    
    public static void main(String[] args) throws Exception 
    {

        // Cricketer c=new Cricketer("sachin",18, 50000);
        // c.disp();

        // FileOutputStream fos=new FileOutputStream("pw.txt");
        // BufferedOutputStream bos=new BufferedOutputStream(fos);
        // ObjectOutputStream oos=new ObjectOutputStream(bos);

        // oos.writeObject(c);
        // oos.flush();
        // oos.close();



        FileInputStream fis=new FileInputStream("pw.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        ObjectInputStream ois=new ObjectInputStream(bis);

        Cricketer data=(Cricketer)ois.readObject();
        data.disp();
        ois.close();
    }
}
