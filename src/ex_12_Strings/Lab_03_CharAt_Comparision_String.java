package ex_12_Strings;

public class Lab_03_CharAt_Comparision_String {
    public static void main(String[] args) {

        String s1 = "Java";

        char a = s1.charAt(2); //checks the index
        System.out.println(a);

        int result= "abc".compareTo("ABC"); //comparing first alphabate vlaue a and A
        System.out.println(result);

        int index = "Java".indexOf(a);
        System.out.println(index);

        int index2 = "Java".lastIndexOf(a);
        System.out.println(index2);

        boolean b = "".isEmpty();
        System.out.println(b); //true

        String b1 = "Java".replace("a","zero");

        String s11 = String.join("*","Python","Java"); //join take multiple elements

        String s12 = "Java".concat("Mava");








    }
}
