package exam_18Jan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        //Write a Java program to reverse a given string using a loop.
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String a = sc.next();
        String Rev = "";

        for(int i=a.length()-1; i>=0;i--)
        {
          Rev = Rev+ a.charAt(i);
        }
        System.out.println(Rev);

    }

}
