package ex_Arrays;

import java.util.Scanner;

public class Lab_03_Array_user_define {
    //How to take user input as Array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the siize of the array");
        int a = sc.nextInt();  // Assume 3

        int[] num = new int[a];// now array is [3]
        for (int i=0; i<num.length; i++)
        {
            System.out.println("Enter the marks");
            num[i]= sc.nextInt(); // We enter 3 numbers
        }
        System.out.println("====");

        for (int i=0; i<num.length; i++)
        {
            System.out.println(num[i]);
        }
    }
}
