package Task;

import java.util.Scanner;

public class Check_validVoters {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter age of the person");

        int age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("Person is eligible for votting");
        }
        else
        {
            System.out.println("Not eligible for voting");
        }
    }
}
