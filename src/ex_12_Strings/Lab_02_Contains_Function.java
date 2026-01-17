package ex_12_Strings;

public class Lab_02_Contains_Function {

    public static void main(String[] args) {

        String name = "partho";
       boolean check= name.contains("P");
        System.out.println(check);





        //2 strings in string constant pool
        String s2 = "Hello";
        s2=s2.concat("name");
        System.out.println(s2);
    }
}
