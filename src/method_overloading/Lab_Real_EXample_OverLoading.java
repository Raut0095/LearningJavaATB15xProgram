package method_overloading;

public class Lab_Real_EXample_OverLoading {
    public static void main(String[] args) {
        WebAutomation a = new WebAutomation();
        a.openBrowser();

    }
}

      class
      WebAutomation{

       void openBrowser()
       {
           System.out.println("DEfault");
        }

        void openBrowser(String browser)
        {
            System.out.println("Starting browser"+ browser);
        }
      }

