// import java.lang.Exception;
import java.util.Scanner;
// import java.util.concurrent.Flow.Publisher;

class MyThread implements Runnable                 //Multiple task using single run method
{
    public void run()
    {
        String name=Thread.currentThread().getName();

        if(name.equals("CALC"))
        {
            Calc();
        }

        else
        {
            ShowMsg();
        }
    }

    public void Calc()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();

        System.out.println("Enter the second number: ");
        int b=sc.nextInt();

        System.out.println("Number stored");
    }

    public void ShowMsg()
    {
        System.out.println("printing msg");

        for(int i=0;i<4;i++)
        {
            System.out.println("focus");
        }

        System.out.println("---------------------------------");
    }
}


class Thread3
{
    public static void main(String[] args) {
        
        MyThread thread1=new MyThread();
        MyThread thread2=new MyThread();

        Thread t1=new Thread(thread1);
        Thread t2=new Thread(thread2);

        t1.setName("CALC");
        t2.setName("SHOW");
        
        t1.start();
        t2.start();



    }
}
