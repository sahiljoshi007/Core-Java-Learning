import java.lang.management.MemoryManagerMXBean;
import java.util.*;

class MyGen<T>
{
    private T obj;

    public MyGen(T obj)
    {
        this.obj=obj;
    }

    public void disp()
    {
        System.out.println("info of type "+ obj.getClass().getName());
    }

    public T getObj()
    {
        return obj;
    }
}

public class Gen3 {
    public static void main(String[] args) {
        
        // ArrayList<String> list1=new ArrayList<String>();

        // List<String> list2ArrayList=new ArrayList<String>();

        // Collection<Integer> list3=new ArrayList<Integer>();

        // List<Object> list4=new ArrayList<String>();   //CE


        MyGen<Integer> g1=new MyGen<Integer>(10);
        g1.disp();
        System.out.println(g1.getObj());


        MyGen<String> g2=new MyGen<String>("India");
        g2.disp();
        System.out.println(g2.getObj());
    }
}
