import java.lang.Exception;
public class MulCatch {

    public static void main(String[] args) {
        int num1=6;
        int num2=0;
        int arr[]={7,5,0,2,5};
        String str=null;
        int result=0;
        try
        {
            System.out.println(arr[4]);
            result=num1/str.length();
        }
        catch(ArithmeticException e)
        {
            System.out.println("something wrong");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Enter valid index value");
        }

        catch(Exception e)
        {
            System.out.println("something went wrong");
        }

        
        
        System.out.println(result);
        System.out.println("bye");
    }
    

}
