// package MultipleThreading;


// Thread creation by extending thread class
import java.security.MessageDigestSpi;
import java.util.Scanner;
import java.lang.Exception;

class calc extends Thread
{
    public void run()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number");
        int num=scan.nextInt();
        System.out.println("Enter String");
        String name=scan.next();

        System.out.println("--------------------------------");
    }
}

class message extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<3;i++)
            {
                System.out.println("*");
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println("something Wrong");
        }
       
        System.out.println("--------------------------------");

        for(int i=0;i<3;i++)
        {
            System.out.println("sahil");
        }
    }
}


public class Thread1 {
    public static void main(String[] args) {
        
       calc t1=new calc();
       t1.start();

       message t2=new message();
        t2.start();


        

    }
}
