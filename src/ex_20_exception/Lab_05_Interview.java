package ex_20_exception;

public class Lab_05_Interview {
    public static void main(String[] args) {
         String a = null;

         try
         {
             a.trim();
             int b =10/0;
         }                        // Pipe charector

         catch (NullPointerException |ArithmeticException e)
         {
             System.out.println("Both exceptions are handeled");
         }
         catch (Exception e)
         {
             System.out.println("yes");
         }
        finally
         {
             System.out.println("It will execute anyhow");
         }
    }
}
