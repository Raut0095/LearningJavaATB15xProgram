package ex_12_Strings;

public class Lab_String05_functions {
    public static void main(String[] args) {
        CharSequence s = "HelloWorld";
        System.out.println(s.subSequence(1,4)); //end-1
        //SubSequence starts from 1. Not from 0.
        String s1 = "Java".substring(2);
        String s2 = "kola".substring(4); //it give no output
        System.out.println(s2);
        System.out.println(s1);

        //endswith
        System.out.println(s1.endsWith("a"));
        //trim - answithout space
        String name = "   Taf   ";
        System.out.println(name.trim());
        //compare to
        System.out.println(name.compareTo("sonal"));



        char[] Array = "java".toCharArray();
        System.out.println(Array);

        String s3 = "bb".repeat(3);
        System.out.println(s3);///repeat bb three times

        long count = "a\nb\nc".lines().count();
        System.out.println(count);

        System.out.println("=".repeat(3));
        System.out.println("print msg#");
        System.out.println("=".repeat(3));

    }
}
