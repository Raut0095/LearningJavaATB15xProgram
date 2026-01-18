package exam_18Jan;

import java.util.Scanner;

public class Count_charecters {
    public static void main(String[] args) {
       // Write a Java program to count the total number of characters in a given string (excluding spaces).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");

        String a = sc.nextLine();
        int count =0;

        for(int i=1;i<a.length();i++)
        {
            if (a.charAt(i) != ' ')
            {
               count++;
            }
            System.out.println(" Total number of charecters are:" + count);
        }
    }
}
