enum Result
{
    PASS , FAIL , NS;
    //public static final result PASS= new Result();
    //public static final result FAIL= new Result();
    //public static final result NS= new Result();

    int marks;

    Result()
    {
        System.out.println("constructor in enum");
    }

    void setMarks(int marks)
    {
        this.marks=marks;
    }

    int getMarks()
    {
        return marks;
    }
}


public class LaunchEnum2 {
    public static void main(String[] args) {
        
        Result.PASS.setMarks(50);
        int m1=Result.PASS.getMarks();
        System.out.println(m1);//50


        int m2=Result.FAIL.getMarks();
        System.out.println(m2);//0

        Result.NS.setMarks(45);
        int m3=Result.NS.getMarks();
        System.out.println(m3);//45
    }
}
