package My_Java_Excercies_Session_VII;

public class StringArrayTest
{
    //String words[] = new String[10];

    String[] words= {"hello", "good", " morning", "how", "are", "you", " ? ", "today", "is", "thursday"};
    public void printStringValue()
    {


        System.out.println("the length of array is " + words.length);
        System.out.println();

        for (int i = 0; i < words.length; i++)
        {
            System.out.println( " array index : " + i +  " value stored  : " + words[i]);

        }

    }


    public void forEachLoop()
    {
        for(String l: words) {
            System.out.println (l);

            String first = l;
            String prev = null;
            if (first == "hello") {
                prev = first;

            }
            System.out.println (prev);
        }
    }
    public static void main(String[] args) {

        StringArrayTest sa=new StringArrayTest();
   //     sa.printStringValue();
        sa.forEachLoop ();
    }

}