package ex_22_Wrapper;

public class Interview {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b= 127;
        System.out.println(a==b); //possible

        Integer c = 128;
        Integer d = 128;
        System.out.println(c==d);//not possible bcz the byte have value till 127
        //Java chaches Integer value form -128 to 127

        // note " Take care when convert from wrapper to primitive
    }
}
