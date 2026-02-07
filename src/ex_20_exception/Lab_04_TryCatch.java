package ex_20_exception;

public class Lab_04_TryCatch {
    //first try with small bucket and then try with Exception
    public static void main(String[] args) {
        System.out.println("1");
        try
        {
            int a=10/0;
        }
        catch (ArithmeticException e)  //small bucket
        {
            System.out.println("exception has handled");
        }
         catch(Exception e)  // big bucket
         {
             System.out.println("multicatch");
         }
        System.out.println(2);
    }
}
