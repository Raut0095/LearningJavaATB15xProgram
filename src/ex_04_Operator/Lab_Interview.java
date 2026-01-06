package ex_04_Operator;

public class Lab_Interview {
    public static void main(String[] args) {
        int balaji_salary = 21;
        boolean b = !(balaji_salary>10 || balaji_salary<5);

        //Divide
        //A-  balaji_salary>10
        //B - balaji_salary<5
        //A||B - True || False - True
        //!True - False

        System.out.println(b);
    }
}
