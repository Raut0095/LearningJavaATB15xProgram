package exam_11Jan;

import java.util.Scanner;

public class simple_Caculator {
    // Write a Java program to perform addition, subtraction, multiplication, or division based on user choice using a switch statement.

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the 1st number");
                int num1 = sc.nextInt();
                System.out.println("enther the 2nd number");
                int num2 = sc.nextInt();
                System.out.println("click 1.additon");
                System.out.println("click 2.subtraction");
                System.out.println("click 3.division");
                System.out.println("click 4.multiplication");
                int res = sc.nextInt();
                switch (res) {
                    case 1:
                        System.out.println("the sum of numbers is " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("the difference of numbers is " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("the multiplication of numbers is " + num1 * num2);
                        break;
                    case 4:
                        System.out.println("the division of numbers is " + num1 / num2);
                        break;


                    default:
                        System.out.println("Invalid input");
                }
            }
        }

