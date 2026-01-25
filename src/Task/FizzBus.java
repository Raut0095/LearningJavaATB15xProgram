package Task;

import java.util.Scanner;

public class FizzBus {

    public static void main(String[] args) {

//print number from 1 to 100
        for (int i =1; i<=100;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("Fizzbuss" );
            }
            else if (i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0)
            {
                System.out.println("buzz");
            }

        }
    }
}
