package ex_12_Strings;

import java.util.Scanner;

public class Lab_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string name:");
        String s = sc.next();

        String Reverse = "";
        for(int i=s.length()-1; i>=0;i-- )          //madam
        {
            Reverse = Reverse + s.charAt(i);
            /* 4-1=3
            m          =m + a
            3-1=2   ma=ma+d
            * */
        }
     if (Reverse.equalsIgnoreCase(s))
     {
         System.out.println("Its an palindrome");
     }
     else {
         System.out.println("Its not an mpalindrome");
     }
    }
}
