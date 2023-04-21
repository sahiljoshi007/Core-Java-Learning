import java.util.ArrayList;

public class Gen1 {
    public static void main(String[] args) {
        
        //TypeSafety
        // String ar[]=new String[10]; 
        // ar[0]="sahil";
        // ar[1]="aman";
        // // ar[2]=10;                

        // String name1=ar[0];
        // String name2=ar[1];


        //No TypeSafety in Collection
        //Typesafety achieved using Generics
        ArrayList<String> al=new ArrayList();
        al.add("jia");
        al.add("jitu");
        // al.add(10);

        // String n1=(String)al.get(0);         //typecasting
        // String n2=(String)al.get(1);
        // String n3=(String)al.get(2);         //Throw classCastException at Runtime

        String n1=al.get(0);
        String n2=al.get(1);
        

    }
}
