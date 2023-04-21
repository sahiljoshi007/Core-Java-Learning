// enum  --> 1.5version

enum week
{
    MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class LaunchEnum1 {


    enum Result
    {
        PASS, FAIL, NS;
    }
    public static void main(String[] args) {
        
        week w=week.MON;
        System.out.println(w);

        int index=week.MON.ordinal();
        System.out.println(index);


        week wr[]=week.values();
        for(week a:wr)
        {
            System.out.println(a  + " : " + a.ordinal());
        }

        
        Result r=Result.PASS;
        System.out.println(r);

    }
}
