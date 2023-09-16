import java.lang.Exception;

class printing implements Runnable           //Interrupt method in multithreading
{
    public void run()
    {
       
        for(int i=0;i<3;i++)
        {
            try
            {
                System.out.println("focus");
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println("Thread is Interrupted");
            }
        }
    }
}


public class Thread5 {
    public static void main(String[] args) {
        printing p=new printing();

        Thread t=new Thread(p);

        t.start();
        t.interrupt();  
    }
}
