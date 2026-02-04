package ex_18_abstraction.Interiewq;

public class Lab_02_Interface_Variables {
}

interface pramod
{
    final int  a = 10;
    void display();
}

class student implements pramod{
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

}
