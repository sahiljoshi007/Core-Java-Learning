import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.*;

public class Map2 {
    public static void main(String[] args) {
        
        Map m=new HashMap();
        m.put(1, "sahil");
        m.put(2, "rohit");
        m.put(3, "rohan");
        m.put(4, "sagar");

        System.out.println(m);

        System.out.println(m.get(4));


        //Iterating the keys
        Set keys=m.keySet();
        Iterator itr=keys.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

       //Iterating the values
        Collection c=m.values();
        Iterator itr1= c.iterator();
        while(itr1.hasNext())
        {
            // System.out.println(itr1.next());
            String str=(String)itr1.next();            //we can also store the data to its specific type by downcasting
            System.out.println(str);
        }


        //Iterating The Entries(Both Keys and Values)
        Set entry=m.entrySet();
        Iterator itr2=entry.iterator();
        while(itr2.hasNext())
        {
            // System.out.println(itr2.next());

            Map.Entry data=(Entry)itr2.next();                
            System.out.println(data.getKey()+ "  :  " + data.getValue());        
        }


    }
}
