package ex_20_exception;

public class Lab_01_exceptionExpalined {
    public static void main(String[] args) {
        System.out.println("Starting of a program");
        String input_user = args[0]; //taking CLI i/p
        int a = Integer.parseInt(input_user); // covert into integere
        Integer output = 100/a;

        System.out.println(output);


    }
}
