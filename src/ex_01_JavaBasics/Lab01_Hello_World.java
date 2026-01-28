package ex_01_JavaBasics;

import java.util.Scanner;

public class Lab01_Hello_World {

    public static void main(String[] args) {
        // System.out.println("Hello world");

   boolean isLeapYear = false;
        int year = 2023;
        if((year %4==0 && year%100!=0)|| (year%400==0))
        {
            isLeapYear = true;

            System.out.println("Its an leap year");
        }
       else
        {
            System.out.println("Its not an leap year");
        }


    }
}

