package exam_11Jan;

import java.util.Scanner;

public class Day_of_the_week {
    public static void main(String[] args) {
      //  Write a Java program to print the name of the day based on a number (1–7) using a switch statement.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 to 7 to check the day ");


        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wensday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;

                case 5:
                    System.out.println("Friday");
                    break;

                case 6:
                    System.out.println("Saturday");
                    break;

                case 7:
                    System.out.println("Sunday");
                    break;

                default:
                    System.out.println("Please enter valid number from 1 to 7");
            }

            System.out.println("Only Integer will be accept");

        }






    }
}
