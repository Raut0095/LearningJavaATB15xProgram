package ex_Arrays;

import java.util.Scanner;

public class Lab_03_Array_user_define {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the siize of the array");
        int a = sc.nextInt();

        int[] num = new int[a];
        for (int i=0; i<num.length; i++)
        {
            System.out.println("Enter the marks");
            num[i]= sc.nextInt();

        }

    }
}
