package ex_05_TypeCasting;

public class Lab_TypeCasting_Narrowing {
   public  static void main(String[] args) {

       int val = 300; //int 32
       byte b = 1; //implict Narrowing/ not possible
       byte b2 = (byte)val;  //explicit Narrowing /byte 8


       long phone = 909998878;
       short s1 =(short) phone;//only explicit narrowing is possible
    }
}
