package ex_14_Oops_Inheritance_Single_Inheritance;

public class UsingInheritance_CommonToAll_TestCase {
    public static void main(String[] args) {
        //creating object for child class
        TestCase Tc1 = new TestCase();
       // System.out.println(Tc1); wrong calling
        Tc1.runTC1();  //type menthod name from child class to call methods value

    }
}
