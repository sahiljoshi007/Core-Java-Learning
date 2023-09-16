import java.lang.Exception;
class Queue 
{
    int x;
    boolean flag=false;

    synchronized public void put(int j)
    {
        try
        {
            if(flag==true)
            {
                wait();
            }
            else
            {
                x=j;
                System.out.println("I Have Produced Value x "+ x);
                flag=true;
                notify();
            }
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
        
    }
    synchronized public void Get()
    {
        try
        {
            if(flag==false)
            {
                wait();
            }
            else
            {
                System.out.println("I Have Consumed Value x "+ x);
                flag=false;
                notify();
            }
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
}


class Producer extends Thread
{
    Queue q;
    Producer(Queue b)
    {
        q=b;
    }

    public void run()
    {
        int i=1;
        while(true)
        {
            q.put(i++);
        }
    }
}


class Consumer extends Thread
{
    Queue q;
    Consumer(Queue a)
    {
        q=a;
    }
    public void run()
    {
        while(true)
        {
            q.Get();
        }
    }
}

public class LaunchPC {
    public static void main(String[] args) {
        Queue q=new Queue();

        Producer p=new Producer(q);
        Consumer c=new Consumer(q);

        p.start();
        c.start();

    }
}
