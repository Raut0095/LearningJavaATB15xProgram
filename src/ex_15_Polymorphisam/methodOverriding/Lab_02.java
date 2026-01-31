package ex_15_Polymorphisam.methodOverriding;

public class Lab_02 {
    public static void main(String[] args) {
       CommonToAll all =new CommonToAll();
       all.openbrowser();

       CommonToAll all1 = new chromeTC();  //dynamic dispatch //common methods can be use only
       all1.openbrowser();

       chromeTC all2 =new chromeTC();
       all2.homeage();
    }
}

  class CommonToAll{
        void openbrowser()
        {
            System.out.println("IE browser");
        }
  }

  class chromeTC extends CommonToAll {
    void openbrowser()
    {
        System.out.println("chrome");
    }

    void homeage()
    {
        System.out.println("homepage");
    }

  }

  class FirefoxTC extends CommonToAll{
    void openbrowser()
    {
        System.out.println("firefox");
    }

  }
