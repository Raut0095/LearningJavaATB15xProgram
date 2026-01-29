package ex_15_Polymorphisam.methodOverriding;

public class Lab_01_overLoading {
    public static void main(String[] args) {
            father f1 = new child();
            f1.home(); //3bhk

    }

    class father{
        void home()
        {
            System.out.println("2bhk");
        }

        class child extends father{
            void home()
            {
                System.out.println("3bhk");
            }

        }
    }
}
