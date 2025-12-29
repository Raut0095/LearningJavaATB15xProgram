package Task;

public class Incremnet26_12 {
    public static void main(String[] args) {


        int a = 10;
        a = a++    + a++ + a++;
        // 10 -> 11+ 11 12 + 12 13
        System.out.println(a);

    }
}