package ex_15_Polymorphisam.methodOverriding;

public class Lab_01_Overiding {
    //inheritance required
    public static void main(String[] args) {
        Father1 a = new child();
          a.home(); // 3bhk
    }
}



    // dynamic dispatch // we can use all common function
    class Father1
    {
        void home() {
            System.out.println("2bhk");
        }
    }

    class child extends Father1 {
        void home() {
            System.out.println("3bhk");
        }
    }




