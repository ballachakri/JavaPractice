package Java_Sample_Programs;

public class IfElseStatement {


// when we need to execute a set of statements based on a condition the we use control flow statements
// Four Types of control statements

// 1. if statement
// if statement get executed only when the condition is true,
// if false then the statements inside if statement body are completely ignored

    public void ifst ( ) {
        int a = 10;

        if (a >= 10) {
            System.out.println (" condition is true control flow");
        }


    }
// 2. nested if statement
// when there is an if statement inside another if statement then it is called nested if statement
    public void nestIf ( ) {
        int a = 5648;

        if (a > 5000) {
            System.out.println (" the condition is true");

            if (a > 5500) {
                System.out.println (" the two conditons are true");
            }
        }
    }
// 3. if- else statement
// the statements indie if would execute if the condition is true, and the statements inside else would execute if the condition is false


    public void ifelse ( ) {
        int a = 35;

        if (a >= 10) {
            System.out.println (" condition is true control flow");
        } else {
            System.out.println (" the condition is false");
        }
    }

// 4. if-else-if statement
//  if- else- if  statement is used when we need to check multiple conditions,
    // the statement can have multiple else-if and one else, it is also known as if else if ladder
    public void ifelseif ( ) {
        int n = 9964;

        if (n >= 1 && n < 100) {
            System.out.println ("two digit number");

        } else if (n >= 100 && n < 1000) {
            System.out.println (" three digit number");
        } else if (n >= 1000 && n < 10000) {
            System.out.println (" four digit number");
        } else {
            System.out.println ("number is not between 1 to 9999 ");
        }

    }
public static void main (String[] args) {
        IfElseStatement obj = new IfElseStatement ();
        obj.ifst ();
        obj.nestIf ();
        obj.ifelse ();
        obj.ifelseif ();
    }
}
