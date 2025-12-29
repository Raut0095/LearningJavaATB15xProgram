package ex_08_Ifcondition;

public class Lab_03_IfElse_CLI_Input {
    public static void main(String[] args) {
        System.out.println("Enter the age via CLI Option");
        int age = Integer.parseInt(args[0]);

        if (age > 18)
        {
            System.out.println("You can vote");
        }
       else
        {
            System.out.println("You can not vote");
        }
    }
}
