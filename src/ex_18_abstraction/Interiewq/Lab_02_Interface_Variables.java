package ex_18_abstraction.Interiewq;

public class Lab_02_Interface_Variables {
    public static void main(String[] args) {
       // pramod p1 = new pramod();// can not create object of interface
        somya s1 = new somya();
        s1.display();

        student s2 = new student();
        s2.display();

    }
}

interface pramod
{
    final int  a = 10;
    void display();
}

class student implements pramod
{
    int aa =100;
  @Override
   public void display()
    {
        System.out.println(a);
        System.out.println(this.aa);
    }
}

class somya implements pramod
{

    public void display()
    {
        System.out.println("somya class is calling");
    }


}

