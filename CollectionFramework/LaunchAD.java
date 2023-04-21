import java.util.ArrayDeque;

public class LaunchAD {
    public static void main(String[] args) {
        
        ArrayDeque ad1=new ArrayDeque();

        ad1.add(100);
        ad1.add(200);
        ad1.add(200);
        System.out.println(ad1);

        ad1.addFirst(10);
        ad1.addLast(99);
        System.out.println(ad1);
        ad1.add("sahil");
        System.out.println(ad1);

        ad1.offer(500);              //offer method (offer may get rejected or implemented)
        ad1.offerLast(66);           //so put that value in offer method which is not important
        ad1.offerFirst(1);           //It work same as add method
        System.out.println(ad1);

    }
}
