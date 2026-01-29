package method_overloading;

public class poly_overLoading {
    public static void main(String[] args) {



    }

    class mathOperation{

        int add(int a, int b)
        {
           return a+b;
        }

        int add(int a, int b, int c)
        {
            return a+b+c;
        }

        double add(double a, double b){
            return a+b;
        }
        String add(String a, String b)
        {
            return a+b;
        }
    }
}
