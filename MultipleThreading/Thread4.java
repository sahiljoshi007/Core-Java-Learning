import java.lang.Exception;

class MyThread implements Runnable                //join() and isAlive() methods in MultiThreading
{
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("focus is important");
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println("something wrong");
        }


    }
}



public class Thread4 {
    public static void main(String[] args) {

        MyThread m=new MyThread();

        Thread t=new Thread(m);
       System.out.println(t.isAlive());  //False
        
        t.start();
        System.out.println(t.isAlive());  //True
        try
        {
            t.join();
        }
        catch(Exception e)
        {
            System.out.println("error");
        }


        System.out.println("main Thread end");
        
    }
}
