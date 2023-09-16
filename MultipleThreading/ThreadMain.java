// Inbuilt classes in MultiThreading
// import java.lang.*;
public class ThreadMain {
    public static void main(String[] args) {
        
        System.out.println("main thread");

        System.out.println("Before changing name");

        String str=Thread.currentThread().getName();
        System.out.println(str);

        System.out.println("The priority of main Thread is: "+Thread.currentThread().getPriority());

        System.out.println("After changing name");
        Thread t= Thread.currentThread();
        t.setName("Master");
        t.setPriority(1);
        String str1=Thread.currentThread().getName();
        System.out.println(str1);
        System.out.println("The priority of main Thread is: "+Thread.currentThread().getPriority());
    }
}
