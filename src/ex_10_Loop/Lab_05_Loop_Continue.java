package ex_10_Loop;

import java.util.Scanner;

public class Lab_05_Loop_Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num =  sc.nextInt();
        for(int i =0; i<num; i++)
        {
            if(num== 5)
            {
                continue; // when 5 came it will skip 5 and print next numbres
            }
            System.out.println("end"); //this one is ignore/ skip
        }
    }
}
