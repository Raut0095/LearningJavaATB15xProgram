package ex_12_Strings;

public class Lab_Interview_Count_strings {

    public static void main(String[] args) {
        ///  2 strings are created
        String s1 = "Pink";
        String s2 ="Pink";
        String s3 ="pink";

        // in case of new -- always diiferent memories create
        String s4 = new String("Pink");
        String s5 = new String("Pink");

       // check for reference
        System.out.println(s1==s4);
        System.out.println(s4==s5);   // can not same

        //equals (content)
        System.out.println(s1.equals(s4));
        //equalIgnore -- it will ignore the capital small
        System.out.println(s1.equalsIgnoreCase(s3));

    }
}
