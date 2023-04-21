import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        
        HashMap hm=new HashMap();
        // hm.put(null, null);
        hm.put(02, "Rohit");     //Entry
        hm.put(03, "Rohan");
        hm.put(04, "Rohan");
        // hm.put(04, "Rohan");     //This Entry will not be considered as key is same
        System.out.println(hm);


        HashMap hm1=new HashMap();
        //Key can be of any type
        hm1.put("virat", "Rohit");     //Entry
        hm1.put("sagar", "Rohan");
        hm1.put("star", "Rohan");
        
        System.out.println(hm1);



        LinkedHashMap lh=new LinkedHashMap();
        //order of insertion is preserved/maintained here
        lh.put("virat", "Rohit");     //Entry
        lh.put("sagar", "Rohan");
        lh.put("star", "Rohan");
        
        System.out.println(lh);


    }
}
