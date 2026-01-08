package ex_10_Loop;

public class Lab_01_For_Lloop {

    public static void main(String[] args) {
        // For Loop
        // Help you to repeat a block of code.

        // Initialization -> Condition -> Updation(Incre/decre)

        //        for(I;C;U){
//            // this is the code that you want to execute multiple times

        for(int i=0; i<10; i++)
        {
            System.out.println(i);  //output will go from 0to 9
        }

        for(int _1=0; _1<10; _1++)
        {
            System.out.println(_1);
        }

     /*   for(int i=0; i++) //use ctrl+c to  stop the program
        {
            System.out.println(i); //execute multiple imes
        }*/

        for (int i=0; i<=10; ++i)
        {
            System.out.println(i);
        }
    }
}
