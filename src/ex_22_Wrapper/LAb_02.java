package ex_22_Wrapper;

import java.sql.SQLOutput;

public class LAb_02 {
    public static void main(String[] args) {

        int a =10;
        Integer aa = a;
        System.out.println(a); //AutoBoxing- Primitive DataType converted to wrapper - Automatic by JVM

        Integer A = 43;
        int b = A; //unboxing
        //A has lost the attribute and behaviour

        //Integet to string
        Integer aaa = 10;
        System.out.println(aaa.toString());
        // to check use below commnand


        System.out.println(aaa.toString() instanceof String);


    }
}
