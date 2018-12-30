package My_Java_Excercies_Session_VII;

import java.util.Random;

public class RandomMethodsPractice
{


public void ranNumber()
{
    Random r=new Random();
    int i=r.nextInt(7);

    System.out.println( i);
}
public void ranemails() {

    Random rd;


    for (int i = 0; i <= 30; i++)
    {
        rd=new Random ();
        int rnumber = rd.nextInt (30);

        String rdemail = "chakri" + rd.toString ().replace ("java.util.Random@", "") + "@gmail.com";
        System.out.println (rdemail);
    }
}
    public static void main(String[] args)
    {
        RandomMethodsPractice robj=new RandomMethodsPractice();
             //   robj.ranNumber();
                robj.ranemails();

    }
}
