import java.lang.Exception;

class car implements Runnable              
{
    public void run()                       //synchronized keyword
    {                                      //allows one Thread to get executed at a time
        try
        {
            System.out.println(Thread.currentThread().getName()+ " Had Enterd the parking lot");
            Thread.sleep(2000);
            synchronized(this)
            {
                System.out.println(Thread.currentThread().getName()+ " Get into car to drive");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+ " Had Started driving");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+ " came and parked car");
                Thread.sleep(2000);
            }

        }
        catch(Exception e)
        {
            System.out.println("error");
        }
    }
}
public class Thread6 {
    public static void main(String[] args) {
        car c=new car();

        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);

        t1.setName("SON1");
        t2.setName("SON2");
        t3.setName("SON3");

        t1.start();
        t2.start();
        t3.start();

    }
}
