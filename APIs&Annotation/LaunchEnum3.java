enum Result
{
    PASS, FAIL, NS;
}


public class LaunchEnum3 {
    public static void main(String[] args) {

        Result res=Result.FAIL;

        switch(res)
        {
            case PASS: System.out.println("passed");
            break;

            case FAIL: System.out.println("fail");
            break;

            case NS: System.out.println("NO Result");
            break;
        }
    }
}
