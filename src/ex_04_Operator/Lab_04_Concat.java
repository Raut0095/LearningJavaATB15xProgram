package ex_04_Operator;

public class Lab_04_Concat {
    public static void main(String[] args) {
        String name1 ="Pramod";
        String name2 = "Dua";
        int a = 10;
        int b = 9;

        System.out.println(name1 + name2 + a+ b);  // Here it sees its a name concating, thats why it don't do addition
        System.out.println(a+b+ name1 +name2); //Here it do addition first

        System.out.println(name1 + name2 +(a+b));
        //BODMAS bracket od Div, mul, add, sub
    }
}
