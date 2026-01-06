package ex_09_Switch;

import java.util.Scanner;

public class Lab_02_Switch {
    public static void main(String[] args) {

     //Interviwe question is what happen when you enter 3 -
        //Ans is nothing will be happen
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 or 2");

        int day = sc.nextInt();
        switch(day){
            case 1 :
                System.out.println("mon");
            case 2:
                System.out.println("tue");
        }

    }
}
