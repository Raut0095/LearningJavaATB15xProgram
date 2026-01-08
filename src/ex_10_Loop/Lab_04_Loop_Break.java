package ex_10_Loop;

public class Lab_04_Loop_Break {
    public static void main(String[] args) {

        /*for(int i=0; i>10; i++)
        {
            System.out.println(i);
            if(i == 5)
            {
                break;
            }
            System.out.println("As 5 meet the program has end"); 12345
        }*/


        for(int i=0; i>20; i++)
        {
            if(i == 5)
            {
                break; //break do not allow to print 5
            }
            System.out.println(i);
        }
        System.out.println("As 5 meet stop the program"); //1234



    }
}
