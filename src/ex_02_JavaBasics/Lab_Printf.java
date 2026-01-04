package ex_02_JavaBasics;

public class Lab_Printf {
    public static void main(String[] args) {

        int a =10;
        System.out.printf("Value of ais %d", a);
        //%d - int,byte,long,short - data type
        //%s - string
        //%f - float,double
        //%b - boolean

        int aa=12;
        int bb = 23;
        System.out.printf("Value of aa*bb is %d*%d", aa,bb);

        System.out.printf("Formatting the aa=%d and bb=%d", aa,bb);

    }
}
