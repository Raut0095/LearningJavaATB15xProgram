package ex_09_Switch;

import java.util.Scanner;

public class Lab_03_Automation_Browser {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name");

        String browser = sc.next();


        switch(browser)
        {
            case "chrome":
                System.out.println("Started chrome browser");
                break;
            case "firefox" :
                System.out.println("Started firefox");
                break;
            case "Microsoft":
                System.out.println("Started edge");
                break;
            default:
                System.out.println("No such browser");
        }
    }
}
