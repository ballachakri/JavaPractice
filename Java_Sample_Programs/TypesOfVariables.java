package Java_Sample_Programs;

public class TypesOfVariables {

    // Three Types of variables;
    // 1 Local Variable -- these variable are declared inside method of the class
    // 2 Static Variable ( or class ) -- associated with class
    // 3 Instance Variable --- each instance of the class has its own copy of instance variable


public static int statVariable=10;
public int instVariable=100;
public int localVariable=1000;

public void myvar()
{
    int localVariable=10000;
    System.out.println (localVariable);
}
    public static void main (String[] args) {
        TypesOfVariables obj=new TypesOfVariables ();
        TypesOfVariables obj1=new TypesOfVariables ();
        TypesOfVariables obj2=new TypesOfVariables ();
        obj1.statVariable=20;
        System.out.println (obj.statVariable);
        System.out.println (obj1.statVariable);
        System.out.println (obj2.statVariable);

        TypesOfVariables obji1=new TypesOfVariables ();
        TypesOfVariables obji2=new TypesOfVariables ();
        TypesOfVariables obji3=new TypesOfVariables ();
        obji1.instVariable=200;
        System.out.println (obji1.instVariable);
        System.out.println (obji2.instVariable);
        System.out.println (obji3.instVariable);

        TypesOfVariables objl=new TypesOfVariables ();
        objl.myvar ();
        System.out.println (obj.localVariable);


    }
}
