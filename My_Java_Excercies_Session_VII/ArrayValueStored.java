package My_Java_Excercies_Session_VII;

public class ArrayValueStored
{
int num[]= {23, 6, 47, 35, 2, 14};



public void avgOfNumbers()
{
    float a=0;
    float avg=0.0000f;
    try {
          for (int i = 0; i <=num.length-1; i++)
            {
             a = a+num[i];
             }
          avg=a/num.length;
          System.out.println( " The average is "+avg);

        }catch (ArrayIndexOutOfBoundsException ai)
    {
        System.out.println(ai.getStackTrace());
    }
}

public void maxValue()
{
    int maxN=num[0];
    for(int j=0; j<num.length;j++)
        {
        if(num[j]>maxN)
            {
            maxN=num[j];
            System.out.println( " The greatest value in the array " + maxN);
            }

    }
}
    public static void main(String[] args) {
        ArrayValueStored ob=new ArrayValueStored();
        ob.avgOfNumbers();
        ob.maxValue();
    }
}
