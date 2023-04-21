// package CollectionFramework;

import java.util.*;

// package CollectionFramework;

public class LaunchLL {
    public static void main(String[] args) {
        
        LinkedList l=new LinkedList();
        l.add(20);
        l.add(30);
        l.add(30);
        l.add(40);
        System.out.println(l);

        System.out.println(l.get(2));
        System.out.println(l.indexOf(20));
        System.out.println(l.lastIndexOf(30));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());

        l.push(10);
        System.out.println(l);

        l.pop();
        System.out.println(l);


        // LinkedList l1=new LinkedList();
        // l1.add("Pw");
        // l1.add('a');
        // l1.add(20);
        // System.out.println(l1);

        // LinkedList l2=new LinkedList();
        // l2.add(10);
        // l2.add(20);
        // l2.add(30);

        // l2.addFirst("pw");
        // l2.addLast(100);
        // l2.add(2,20);
        // System.out.println(l2);

        // System.out.println(l2.peek());
        // System.out.println(l2);

        // System.out.println(l2.poll());
        // System.out.println(l2);
    }
}
