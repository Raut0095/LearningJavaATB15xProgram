package ex_13_OPPS.Multilevel_Inheritance;

import javax.management.MBeanAttributeInfo;

public class Lab_01_Csllingmethods {
    public static void main(String[] args) {
        son name = new son();
        //son can access everything
        name.bhk3(); // self sons method
        name.Home();//grandfathers method
        name.extraMoney();//father method

        GrandFather Gf = new GrandFather();
        Gf.Home();//It will useonly self method not fathers and sons

        //Dynamic dispatch
        //It means another ref and another object for e.g. g1 and son
        GrandFather g1 = new son(); //when son born GRandfather is their
     //  System.out.println(g1.Home()); //only self methods calls
        Father f1 = new son(); //when son born father is their
     //   System.out.println(f1.Home());
       /* son s1 = new GrandFather(); //not allow
        son s2 = new Father();*/

    }
}
