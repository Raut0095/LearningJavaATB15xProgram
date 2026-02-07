package ex_20_exception;

public class Lab_06_Throw {
    public static void main(String[] args) {

    }

    static void DividebyZero(int a)
    {
        if(a==0)
        {
            throw new ArithmeticException("Error ==0");
        }
    }
}
