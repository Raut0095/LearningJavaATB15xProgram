package ex_10_Loop;

import java.util.Scanner;

public class Lab_06_Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive number");   //for Negative number factoraial will always 1
        int fact = 1;

        if (sc.hasNextInt())  //check user input is integer
        {
            int n = sc.nextInt();  // user input value store in n

            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("factorial is =" + fact);
        }
        else
        {
            System.out.println("Enter the valid Number");
        }

        sc.close();
    }
}


