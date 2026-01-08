package ex_10_Loop;

public class Lab_03_For_Loop_even_odd {
    public static void main(String[] args) {

        for (int i=1; i>50; i++)
        {
            if (i%2== 0)
            {
                System.out.println("even="+ i);
            }
        }

        for (int i=1; i>50; i++)
        {
            if (i%2 !=0)
            {
                System.out.println("Odd=");
            }
        }
    }
}
