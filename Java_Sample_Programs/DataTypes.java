package Java_Sample_Programs;

public class DataTypes {

static byte vbyte=123;   //  1 byte  ( - 128 to  127)
static short vshort=12345;  // 2 bytes ( -32,768 to 32767 )
static int vint=1234567891;   // 4 bytes ( -2,147,483,648 to 2,147,483,647 )
static long vlong=1234567891;  // 8 bytes ( -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
static char vchar='a'; // 2 byes  -- holds characters
static float vfloat=1234567891.231235f; // 4 bytes -- holding 6 to 7 decimal digits
static double vdouble=1234567891.123335555;  // 8 bytes --- holding 15 decimals digits
static boolean vboolean=true; // holds true or false

    public static void main (String[] args) {
        System.out.println (" byte  //  1 byte  ( - 128 to  127)  " +vbyte);
        System.out.println (" short  // 2 bytes ( -32,768 to 32767 )  " +vshort);
        System.out.println (" long  // 4 bytes ( -2,147,483,648 to 2,147,483,647 )  " +vlong);
        System.out.println (" int   // 8 bytes ( -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807) " +vbyte);
        System.out.println (" char  // 2 byes  -- holds characters  " +vchar);
        System.out.println (" float // 4 bytes -- holding 6 to 7 decimal digits   " +vfloat);
        System.out.println (" double // 8 bytes --- holding 15 decimals digits    " +vdouble);
        System.out.println (" boolean // holds true or false   " +vboolean);
    }

}
