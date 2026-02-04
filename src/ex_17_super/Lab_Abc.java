package ex_17_super;

public class Lab_Abc {
}

class vehicle {
    public int maxSpeed = 100;

    vehicle()
    {
        System.out.println("Default const");
    }
    vehicle(int a)
    {
        System.out.println("pop conrn");
    }
    void message()
    {
        System.out.println("method overloading");
    }
    void message(int a )
    {
        System.out.println("parameter- argument");
    }
    void noTest()
    {
        System.out.println("empty");
    }
    void drive()
    {
        System.out.println("drive");
    }
}

class car extends vehicle{
    //
  private int maxSpeed = 281;
  //call arent constructor
  car()
  {
      super(100);
  }
  void test()
  {
      System.out.println("empty");
  }
  void drive()
  {
   super.drive();
   this.test();
   super.noTest(); //parent
  }

}
