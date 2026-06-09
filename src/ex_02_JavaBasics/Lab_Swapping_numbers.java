package ex_02_JavaBasics;

public class Lab_Swapping_numbers {


    public static void main(String[] args) {
        int a=10,b=20;
        int t;
        System.out.println("before run valueof a"+a+" " +"value of b"+b);
        //Logic 1
//        t=a;
//        a=b;
//        b=t;
//
        //logic2 withoutusing third variable
//        a=a+b;
//        b=a-b;
//        a=a-b;

        //logic3 using *and /
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("values after swapping a"+ a +" "+"b"+b);

    }



}
