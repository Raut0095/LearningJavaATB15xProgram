package ex_01_JavaBasics;

import java.util.Scanner;

public class Lab01_Hello_World {

    public static void main(String[] args) {
        // System.out.println("Hello world");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n of the pattern");

        int n = sc.nextInt();

        for(int i=n; i>=0; i--)
        {
            for(int j=0; j>=i; j++)
            {
                System.out.println("*");
            }
            System.out.println();

        }


    }
}

