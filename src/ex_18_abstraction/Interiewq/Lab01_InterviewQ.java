package ex_18_abstraction.Interiewq;

public class Lab01_InterviewQ {}

    // yees we can create interfaces like these
    interface I11{}

    interface I12{}

    class A1{}
    class B1{}
   // class C1 extends A1, B1{}this cannot be possible

    class Test2 implements I11,I12{}
    class Test3 extends A1 {}
    class Test4 extends A1 implements I11,I12{}

   // interface I3 extends A1{}  not allowed
