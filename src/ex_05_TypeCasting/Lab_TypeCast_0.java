package ex_05_TypeCasting;

public class Lab_TypeCast_0 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;  //implicit -widening jvm/Java do automatically internally
      //  boolean f =b; //incompatible data type is not possble
         float f =b;


        int a1 = (int)b; //explicit -widening/ converting this to this/ west of time / it run automatically by JVM

    }
}
