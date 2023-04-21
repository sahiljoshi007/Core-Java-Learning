import javax.xml.stream.events.EntityReference;
import java.util.Map.*;
import java.util.*;

class student
{
    private String name;
    private int age;
    private String city;

    public student (String name,int age,String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }

    public String getName()
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String toString()
    {
        return name+" "+age+" "+city;
    }
}





public class Map3 {
    public static void main(String[] args) {
        
        student st=new student("sahil", 18, "Bengaluru");
        student st1=new student("Rohit",20,"ghaziabad");
        student st2=new student("rahul",16,"mumbai");


        Map m=new HashMap();
        m.put(1,st);
        m.put(2, st1);
        m.put(3,st2);

        System.out.println(m);


        Set s=m.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            // System.out.println(itr.next());
            // Object obj=(Object)itr.next();
            Entry e=(Entry)itr.next();
            System.out.println(e.getKey()+" "+e.getValue());
            
        }

    }
}
