package ex_20_exception;

public class Lab_03_HandleException {
    public static void main(String[] args) {
        int  a=0;
        try
        {
           a=10/0;
        }
        catch(Exception e)
        {
            System.out.println("Divide by zero not allowed");
            System.out.println(e.getMessage());

        }
        System.out.println(a);
    }
}
