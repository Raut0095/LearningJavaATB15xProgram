package Task;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        //Create scaneer object to read user input
        Scanner sc = new Scanner(System.in);
        //take user input
        System.out.println("Enter name");
        //string will read text
        String name = sc.nextLine();

        System.out.println("Enter age");
        int age = sc.nextInt();

        //Display users input
        System.out.println("My name is"+ name+ "age is"+ age);


    }
}
