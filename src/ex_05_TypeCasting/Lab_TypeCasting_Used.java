package ex_05_TypeCasting;

public class Lab_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float NSRT_GST = 18.45f; //float is a bigger basket
        //Trying to put float in int
      //  int total = course+ NSRT_GST; // impicit Narrowing
//        int total =  course+ (int)NSRT_GST; //explicit narrrowing



      //  best to use bigger data type when we do smaller basket with bigger basket.
         float total2 = course+ NSRT_GST; //widening - Implicit
        //float total3 = (float) course+ NSRT_GST; // widening - explicit
        System.out.println(total2);
    }
}
