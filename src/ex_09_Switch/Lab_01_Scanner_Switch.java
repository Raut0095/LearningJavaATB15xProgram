package ex_09_Switch;
import java.util.Scanner;

public class Lab_01_Scanner_Switch {
    public static void main(String[] args) {
        /*
        * // You need to take a user input and ask for the integer from 1 to 7.
    // And if user enters 1 to 7,
    // you will tell which day it is.

    // Logic Building Formula

    // Step 1 - Number one is using the Scanner class.
    // Step 2 number two will be basically figuring out the expression and the day.
    // Step 3- We will basically add step 3 as a rough logic.
    // Step 4 - 4 is you will write the fix the logic and optimize.
    // Step 5 - figure out the edge cases.
*/
        //take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number from 1 to 7 for the day program");

       //you have to check edge case
        if(sc.hasNextInt()) {

              //in day - it will be available
            int day = sc.nextInt(); //in sc nextInt - you entered number will be visible here
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;   //after getting result the program will end and don't print all the below list
                case 2:
                    System.out.println("Tue");
                case 3:
                    System.out.println("wed");
                case 4:
                    System.out.println("Thu");
                    //when nothing matches
                default:
                    System.out.println("pls enter number from 1 to 7 to check the day");
            }
        }
        else
        {
            System.out.println("Invalid Integer is entered");
        }
        System.out.println("program end after break");
    }
}
