package exam_11Jan;

public class Find_Pos_Neg_num_Using_Ternery {

    public static void main(String[] args) {

        //Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.
        int a=1;
        String verify = (a>0)? "positive" :(a<0)? "negative": "zero";
        System.out.println(verify);


    }
}
