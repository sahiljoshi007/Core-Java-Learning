import java.util.*;

class Student1
{
    private String name;
    private String id;
}

class Employee1
{
    private String name;
    private String id;
}

public class Gen2 {
    public static void main(String[] args) {
        
        Student1 s1=new Student1();
        Student1 s2=new Student1();

        Employee1 e=new Employee1();

        ArrayList<Student1> al=new ArrayList();
        al.add(s1);
        al.add(s2);
        // al.add(e);

    }
}

