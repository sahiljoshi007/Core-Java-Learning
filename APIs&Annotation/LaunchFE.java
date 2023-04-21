import java.nio.channels.AcceptPendingException;
import java.util.*;

public class LaunchFE {                              //forEach() Method 
    public static void main(String[] args) {
        
        // List<Integer> list1=new ArrayList<Integer>();
        // list1.add(2);
        // list1.add(4);
        // list1.add(5);
        // list1.add(8);
        // list1.add(9);
        // System.out.println(list1);


        List<Integer> list2=Arrays.asList(2,4,5,8,9);
        System.out.println(list2);

        // for (Integer a : list2) {
        //     System.out.println(a);
        // }


        // Consumer<Integer> cons=new Consumer<Integer>()
        // {
        //     public void accept<Integer i>
        //     {
        //         System.out.println(cons);              
        //     }
        // };

        list2.forEach(n->System.out.println(n));



    }
}
