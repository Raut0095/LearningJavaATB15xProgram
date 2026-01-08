package ex_11_While_Loop;

public class Lab_04_FACTORIAL {
    public static void main(String[] args) {

        int num= 3;
        int fact =1;
        int i=1;
        while(i<=num)
        {
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial is ="+ fact);
    }
}
