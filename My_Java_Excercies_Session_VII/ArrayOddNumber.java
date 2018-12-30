package My_Java_Excercies_Session_VII;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayOddNumber
{
int a[] = {23,45,76,13,4,90,34,65,13,9};

public void max()
{
    int maxVal=a[0];
     for(int i=0;i<a.length;i++)
     {
       if(a[i]>maxVal)
         {
             maxVal=a[i];
         }
     }
    System.out.println ("Maximum Valie   " + maxVal);
}

public void min()
{
    int minVal=a[0];
    for(int i=0;i<a.length;i++)
    {
        if(a[i]<minVal) {
            minVal = a[i];
        }
    }
    System.out.println ("Minimum value    :" +minVal  );
}




public void printOddNumbers()
{

     for(int i=0;i <a.length;i++)
        {
            if(a[i]%2!=0)
            {
            System.out.println(a[i]);
            }

        }
}

public void iter()
{
    ArrayList<String> names = new ArrayList<String>();
     names.add ("ram" );
     names.add ("shamm");
     names.add ("rajesh");
     names.add ("ravi");

    Iterator itr=names.iterator ();
     //String first=itr.toString ();

    while(itr.hasNext ()) {
        //String str = (itr.next ().toString ());
        if (itr.toString().equalsIgnoreCase (" rajesh")) {
            break;
        }
        System.out.println (itr);
    }

    }





public void sumOfNumbers()
{
    int b=0;
    for(int i =0;i<a.length;i++)
    {
     b=b+a[i];
     if(i==a.length-1)
         System.out.println(b);;

    }
}
   public static void main(String[] args) {
    ArrayOddNumber aobj=new ArrayOddNumber();
// //      aobj.printOddNumbers();
//       aobj.sumOfNumbers();
     aobj.max ();
     aobj.min ();
     aobj.iter ();
     }
}
