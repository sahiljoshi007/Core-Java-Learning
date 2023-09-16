import java.lang.Exception;

class Library implements Runnable                               //DEADLOCK
{
    String res1=new String("JAVA");
    String res2=new String("SQL");
    String res3=new String("DBMS");

    public void run()
    {
        String name=Thread.currentThread().getName();

        if(name.equals("STUDENT1"))
        {
            try
            {
                Thread.sleep(3000);
                synchronized(res1)
                {
                    System.out.println("Student1 has acquired "+ res1);
                    Thread.sleep(3000);
                    synchronized(res2)
                    {
                        System.out.println("Student1 has aquired "+res2);
                        Thread.sleep(3000);
                        synchronized(res3)
                        {
                            System.out.println("Student1 has Aquired "+res3);
                        }
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("some problem");
            }
        }
        else
        {
            try
            {
                Thread.sleep(3000);
                synchronized(res3)
                {
                    System.out.println("Student2 has acquired "+ res3);
                    Thread.sleep(3000);
                    synchronized(res2)
                    {
                        System.out.println("Student2 has aquired "+res2);
                        Thread.sleep(3000);
                        synchronized(res1)
                        {
                            System.out.println("Student2 has Aquired "+res1);
                        }
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("some problem");
            }
        }
    }
}


public class Thread7 {
    public static void main(String[] args) {
        Library lib=new Library();

        Thread t1=new Thread(lib);
        Thread t2=new Thread(lib);

        t1.setName("STUDENT1");
        t2.setName("STUDENT2");
        
        t1.start();
        t2.start();
        

    }
}
