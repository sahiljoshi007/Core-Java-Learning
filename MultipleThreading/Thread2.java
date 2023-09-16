import java.util.Scanner;
import java.lang.Exception;
// creating Thread using Runnable Interface 
class calc implements Runnable
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

class message implements Runnable
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


public class Thread2 {
    public static void main(String[] args) {
        
       calc c=new calc();
       message m=new message();
       
       Thread t1=new Thread();
       Thread t2=new Thread();
       t1.start();
        t2.start();


        

    }
}

