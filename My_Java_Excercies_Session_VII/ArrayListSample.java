package My_Java_Excercies_Session_VII;

import java.util.ArrayList;

public class ArrayListSample {

    ArrayList<String> empNames = new ArrayList<>();

    public void addEmpName() {

        empNames.add(" Daniel");
        empNames.add(" Farouk");
        empNames.add(" Aziz");
        empNames.add(2," sid  - Security Gaurd");
        empNames.add(1, " Chakra  - Manager  ");
        empNames.add(" Shazia ");
        empNames.add(0," Tomas -  Area Manager");

// using for loop
//        for (int i = 0; i < empNames.size(); i++) {
//            System.out.println(empNames.get(i));
//        }
// using for each loop
for(String e: empNames)
{
  //  System.out.println(empNames.get(0));
    System.out.println(e);

}
    }

    public static void main(String[] args) {

    ArrayListSample a=new ArrayListSample();
    a.addEmpName();

    }


}
