package Java_Sample_Programs;

public class Operators {


// Types of Operators

//  1. Arithmetic Operators  ( + , - , *  ,  /  ,  % )


    public void ArithOperator()
    {
        int a= 20;
        int b = 10;
        int c =a+b;
        System.out.println( " /// addition operator ///         : " + a + " + " + b + " = " + a+b);
        System.out.println (" /// addition operator ///         : " + a + " + " + b + " = " + (a+b));
        System.out.println (a+b);
        int d=a-b;
        System.out.println( " /// substraction operator ///     : " + a + " - " + b  + " =  " + (a-b));
        System.out.println (a-b);
        int e=a*b;
        System.out.println( " /// multiplication operator ///   : " + a + " * " + b + "  =  " + e);
        System.out.println (a*b);
        int f=a/b;
        System.out.println( " /// division operator ///         : " + a + " / " + b + "   =  " + f);
        System.out.println (a/b);
        int g =a%b;
        System.out.println( " /// reminder operator ///         :  " + a + " % " + b + "   =   " + g);
        System.out.println (a%b);

    }

//  2. Assignment Operators ( = ,   +=  , -=  ,  *=  , /=  , %=  )

    //  num2 = num1   --- would assign the variable num1 to num1
    //  num2 += num1  --- means num2 = num2 + num1
    //  num2 -= num1  --- means num2 = num2 - num1
    //  num2 *= num1  --- means num2 = num2 * num1
    //  num2 /= num1  --- means num2 = num2 / num1
    //  num2 %= num1  --- means num2 = num2 % num1

    public void assignOperator()
    {
    int a= 5,b=2;

    System.out.println ( " a   = " + a + "   : b   =  " + b  );
    //  num2 = num1   --- would assign the variable num1 to num1
    a=b;
    System.out.println ("  =  operator   : " + (a) );
    //  num2 += num1  --- means num2 = num2 + num1
    a+=b;
    System.out.println ("  += operator   : " + (a) );
    //  num2 *= num1  --- means num2 = num2 * num1
    a-=b;
    System.out.println ("  -= operator   : " + (a ));
    //  num2 *= num1  --- means num2 = num2 * num1
    a*=b;
    System.out.println ("  *= operator   : "  + (a));
    //  num2 /= num1  --- means num2 = num2 / num1
    a/=b;
    System.out.println ("  /= operator   : " + ( a) );
    //  num2 %= num1  --- means num2 = num2 % num1
    a%=b;
    System.out.println ("  %= operator   : "+ (a));
    }

//  4. Comparison ( relational) Operators  ) == , != ,  >  , <  , >=  , < = )

    //   ==  --  returns true if left side and right side are equal
    //   !=  -- returns true if left side is not equal to right side of operator
    //   > -- returns true is left side is greater tha right side
    //   < -- returns true if left side is less than the right side
    //   >=  -- returns true if left side is greater than or equal to right side
    //   <=  --  returns true if left side is less than or equal to right side
public void compOperator()
{
    int a= 10;
    int b=15;

  if(a==b)
    {
        System.out.println (" both are equal ");
    }
    else
  {
      System.out.println (" both are not equal");
  }
    if(a!=b)
    {
        System.out.println (" both are not equal ");
    }
    else
    {
        System.out.println (" both are equal");
    }
    if(a>b)
    {
        System.out.println (" a is greater than b ");
    }
    else
    {
        System.out.println (" b is greater than a");
    }
    if(a<b)
    {
        System.out.println (" a is less than b ");
    }
    else
    {
        System.out.println (" b is less than a");
    }
    if(a>=b)
    {
        System.out.println (" a is greater or equal to b ");
    }
    else
    {
        System.out.println (" b is greater than a");
    }
    if(a<=b)
    {
        System.out.println (" a is less than or equal to  b ");
    }
    else
    {
        System.out.println (" b is less than a");
    }

}
//  3. Logical Operators  (  && , ||  ,  ! )

    // are used with binary variable mainly in conditional statements and loops to evaluate a condition
    // b1 && b2 -- returns true if both b1 and b2 are true else it would return false
    // b1 || b2 -- returns false if both b1 and b2 are false else would return true
    // !b1 would return the opposite of b1, that means it would be true if b1 is false and it would return false if b1 is true

    public void logicalOperator()
    {
        boolean b1= true;
        boolean b2= false;
        System.out.println (" && " + ( b1 && b2 ));
        System.out.println (" || " + ( b1 || b2));
        System.out.println ( " ! " +  !(b1 && b2 ));
    }

//  5. Auto-increment and Auto-decrement Operators ( ++ , -- )

    // num ++  means num = num + 1
    // num --  means num = num - 1

    public void incrDecr() {
        int a = 10;
        int b = 20;
        a++;
        b--;
        System.out.println (" A++  : " + a);
        System.out.println (" b --   : " + b);
    }

//  6. Ternary Operators

    // This Operator evaluates a boolean expression and assign the value based on the result
    // Variable num1 = ( expression ) ? value if true : value if false

    public void ternary ( ) {
        int n1, n2;
        n1 = 100;

        n2 = (n1 == 10) ? 500 : 1000;
        System.out.println (n2);
        n2=(n1==100) ? 500:1000;
        System.out.println (n2);
}
    public static void main (String[] args) {
        Operators obj=new Operators ();
         obj.ArithOperator ();
         obj.assignOperator ();
         obj.compOperator ();
         obj.logicalOperator ();
         obj.incrDecr ();
         obj.ternary ();
    }
}
