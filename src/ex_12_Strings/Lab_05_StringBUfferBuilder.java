package ex_12_Strings;

public class Lab_05_StringBUfferBuilder {
    public static void main(String[] args) {
        //STRING BUFFER IS THREAD SAFE

        //mutable in nature --it can change
                          //stored in object Area
        StringBuffer c = new StringBuffer("Kayra Hello World");
//        c.append("Helo");
//        c.reverse();
//        c.replace(0, 4,"c=");
       // c.delete(0,3);
        System.out.println( c.substring(1,5));

        System.out.println(c);
    }
}
