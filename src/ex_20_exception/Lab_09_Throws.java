package ex_20_exception;

import java.util.Scanner;

public class Lab_09_Throws {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter masharom quantity");

        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
        static void validateAge(int age) throws Exception {
           if(age<18)
           {
               throw new Exception("You are minor can not go to Goa!");
           }
        }


    }

