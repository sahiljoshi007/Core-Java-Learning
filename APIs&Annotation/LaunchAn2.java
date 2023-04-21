import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface cricketPlayer
{
    String country() default "india";
    int age() default 45;
}


@cricketPlayer()
class Virat
{
    
    private int innings;
    private int runs;

    public void setInnings(int innings)
    {
        this.innings=innings;
    }

    public void setRuns(int runs)
    {
        this.runs=runs;
    }

    public int getInnings()
    {
        return innings;
    }

    public int getRuns()
    {
        return runs;
    }
}


public class LaunchAn2 {
    public static void main(String[] args) {
        
        Virat v=new Virat();
        v.setInnings(300);
        v.setRuns(5000);

        System.out.println(v.getInnings());
        System.out.println(v.getRuns());


        //reflection API used to get the information inside Annotation
        Class c=v.getClass();                    
        Annotation a=c.getAnnotation(cricketPlayer.class);
        cricketPlayer cp=(cricketPlayer)a;

        String country=cp.country();
        System.out.println(country);

        int age=cp.age();
        System.out.println(age);
    }
}
