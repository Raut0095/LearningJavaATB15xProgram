package ex_06_Ternary_Operator;

public class Lab_05FndMaxNumb_btw_Two_Numb {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int max = x>y ?  x : y;
        int min = y>x? y:x;
        System.out.println(max);
        System.out.println(min);

    }
}
