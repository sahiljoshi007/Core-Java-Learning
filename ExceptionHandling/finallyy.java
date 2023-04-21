import java.util.Scanner;
import java.lang.Exception;
public class finallyy {
    public static void main(String[] args) {
        int num=0;

        
        
        try(Scanner sc=new Scanner(System.in))        // try with resource
        {
            num=sc.nextInt();
            System.out.println(num);
        }

        catch(Exception e)
        {
            System.out.println("something Went Wrong");
        }

        // finally block          

        // finally              
        // {
        //     sc.close();
        // }
    }
}
