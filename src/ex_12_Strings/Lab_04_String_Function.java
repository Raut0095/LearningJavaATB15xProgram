package ex_12_Strings;

public class Lab_04_String_Function {
    public static void main(String[] args) {
        String s1 = "Java";
        char c = s1.charAt(3);
        System.out.println(c);

        String s2 = "mj";
        String s3 = "mj";
        String s4 = new String("mj");

        System.out.println(s2==s3);
        System.out.println(s2==s4);
        System.out.println(s2.equalsIgnoreCase(s4));
        


    }
}
