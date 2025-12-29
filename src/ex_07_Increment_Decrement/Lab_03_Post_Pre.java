package ex_07_Increment_Decrement;

public class Lab_03_Post_Pre {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // Line no. | a | A | B
        // 6        | 10
        //7         | 10 | a++ | ++a
        //               | A= 10 a=11 | a=11+1=12 B=12


    }
}

