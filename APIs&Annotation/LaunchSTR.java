import java.util.*;
import java.util.stream.*;

public class LaunchSTR {
    public static void main(String[] args) {
        
        List<Integer> list=Arrays.asList(8,4,2,7,5);

        Stream<Integer> streamData=list.stream();
        // long count=streamData.count();
        // System.out.println(count);

        Stream<Integer> finalStream=streamData.filter(n->n%2==0).sorted().map(n->n*2);

                            //or

        // Stream<Integer> finalStream=streamData.filter(n->n%2==0);
        // Stream<Integer> sortStream=filterStream.sorted();
        // Stream<Integer> mapStream=sortStream.map(n->n*2);

        
        finalStream.forEach(i->System.out.println(i));

        // streamData.forEach(i->System.out.println(i));     //we can work on stream only one time


    }
}
