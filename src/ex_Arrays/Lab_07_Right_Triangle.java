package ex_Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_07_Right_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n of the pattern e.g. of 3");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++)     // i =0; 0<3;  i++ i=1  i++ i=2
        {
            for (int j=0; j<=i; j++)  //j=0 0<=0 / 0<1  / 0<2 j++
            {
                System.out.print("*"); //*
            }
            System.out.println(" ");
        }


    }
}
