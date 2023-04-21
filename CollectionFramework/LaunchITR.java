import java.util.*;
public class LaunchITR {
    public static void main(String[] args) {
        
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(100);
        System.out.println(al);

        //for loop                                Not recommended to use loops for fetching data
        // for(int i=0;i<al.size();i++)
        // {
        //     // Object a=al.get(i);
        //     // System.out.println(a);
        //              //or
        //     System.out.println(al.get(i));

        // }



        // //for each
        // for(Object a:al)
        // {
        //     System.out.println(a);
        // }


        Iterator itr=al.iterator();
        while(itr.hasNext())
        {                                             //while fetching data if programmer want to make
            // int i=(int)itr.next();                    //data of integer type using downcasting

            System.out.println(itr.next());
        }


        ListIterator litr=al.listIterator(al.size());       //only used in linked based classes
        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }


    }
}
