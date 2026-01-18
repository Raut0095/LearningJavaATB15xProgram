package exam_18Jan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CompareToString {
    public static void main(String[] args) {
        // Write a Java program to compare two strings and check whether they are equal or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String:");
        String s1 = sc.next();

        System.out.println("ENter the second string");
        String s2 = sc.next();

        if (s1==s2){
            System.out.println("String is Equal");
        }
        System.out.println("String is not equal");
    }
}
